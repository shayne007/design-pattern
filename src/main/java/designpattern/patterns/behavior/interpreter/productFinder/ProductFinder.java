package designpattern.patterns.behavior.interpreter.productFinder;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 产品查询
 * @Author fengsy
 * @Date 8/13/22
 */
public class ProductFinder {
    private ProductRepository repository;

    public ProductFinder(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> byColor(Color colorToFind) {
        return this.repository.productList.stream().filter(product -> product.getColor().equals(colorToFind))
            .collect(Collectors.toList());
    }

    public List<Product> byPrice(float priceToFound) {
        return this.repository.productList.stream().filter(product -> product.getPrice() == priceToFound)
            .collect(Collectors.toList());
    }

    public List<Product> findByColorSizeAndBelowPrice(Color color, ProductSize size, float price) {
        return this.repository.productList.stream()
            .filter(
                product -> product.getColor().equals(color) && product.getSize() == size && product.getPrice() < price)
            .collect(Collectors.toList());
    }

    public List<Product> findBelowPriceAvoidingAColor(float price, Color color) {
        return this.repository.productList.stream()
            .filter(product -> product.getPrice() < price && !product.getColor().equals(color))
            .collect(Collectors.toList());
    }
}
