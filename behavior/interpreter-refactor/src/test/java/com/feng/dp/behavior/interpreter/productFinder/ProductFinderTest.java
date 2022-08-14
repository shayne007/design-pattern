package com.feng.dp.behavior.interpreter.productFinder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductFinderTest {
    private ProductFinder finder;
    private Product fireTruck = new Product("f1234", "FireTruck", Color.Red, 8.95F, ProductSize.MEDIUM);
    private Product barb = new Product("b7775", "barb", Color.Yellow, 15.95f, ProductSize.SMALL);
    private Product baseball = new Product("b2333", "baseball", Color.White, 8.95F, ProductSize.NOT_APPLICABLE);
    private Product toy = new Product("p1112", "Toy", Color.Red, 230.00F, ProductSize.NOT_APPLICABLE);

    @BeforeEach
    void setUp() {
        finder = new ProductFinder(createProductRepository());
    }

    private ProductRepository createProductRepository() {
        ProductRepository repository = new ProductRepository();
        repository.add(fireTruck);
        repository.add(barb);
        repository.add(baseball);
        repository.add(toy);
        return repository;
    }

    @Test
    void findByColor_should_work() {
        ColorSpecification spec = new ColorSpecification(Color.Red);
        List<Product> products = finder.selectBy(spec);
        assertEquals("found 2 red products", 2, products.size());
        assertTrue("found fireTruck", products.contains(fireTruck));
        assertTrue("found Toy", products.contains(toy));
    }

    @Test
    void findByPrice_should_work() {
        BelowPriceSpecification spec = new BelowPriceSpecification(8.95f);
        List<Product> foundProducts = finder.selectBy(spec);
        assertEquals("found 2 products that cost $8.95f", 2, foundProducts.size());
        for (Product product : foundProducts) {
            assertTrue(product.getPrice() <= 8.95f);
        }

    }

    @Test
    void findByColorSizeAndBelowPrice_should_work() {
        AndSpecification spec1 = new AndSpecification(
            new AndSpecification(new ColorSpecification(Color.Red), new SizeSpecification(ProductSize.SMALL)),
            new BelowPriceSpecification(10.00f));
        List<Product> foundProducts = finder.selectBy(spec1);
        assertEquals("found no small red below $10.00", 0, foundProducts.size());
        AndSpecification spec = new AndSpecification(
            new AndSpecification(new ColorSpecification(Color.Red), new SizeSpecification(ProductSize.MEDIUM)),
            new BelowPriceSpecification(10.00f));
        foundProducts = finder.selectBy(spec);
        assertEquals("found fireTruck when looking for medium red below $10.00", fireTruck, foundProducts.get(0));
    }

    @Test
    void findBelowPriceAvoidingAColor_should_work() {
        AndSpecification spec1 = new AndSpecification(new BelowPriceSpecification(9.00f),
            new NotSpecification(new ColorSpecification(Color.White)));
        List<Product> foundProducts = finder.selectBy(spec1);
        assertEquals("found 1 non-white product < $9.00", 1, foundProducts.size());
        assertTrue("found fireTruck", foundProducts.contains(fireTruck));

        AndSpecification spec2 = new AndSpecification(new BelowPriceSpecification(9.00f),
            new NotSpecification(new ColorSpecification(Color.Red)));
        foundProducts = finder.selectBy(spec2);
        assertEquals("found 1 non-red product < $9.00", 1, foundProducts.size());
        assertTrue("found baseball", foundProducts.contains(baseball));
    }
}