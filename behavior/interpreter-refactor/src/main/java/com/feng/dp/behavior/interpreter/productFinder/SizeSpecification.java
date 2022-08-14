package com.feng.dp.behavior.interpreter.productFinder;

/**
 * @Description 型号大小 规格实现
 * @Author fengsy
 * @Date 8/14/22
 */
public class SizeSpecification extends Specification {

    private ProductSize productSizeToFind;

    public SizeSpecification(ProductSize productSizeToFind) {
        this.productSizeToFind = productSizeToFind;
    }

    public ProductSize getProductSizeToFind() {
        return productSizeToFind;
    }

    @Override
    boolean isSatisfiedBy(Product product) {
        return getProductSizeToFind() == product.getSize();
    }
}
