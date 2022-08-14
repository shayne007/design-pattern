package com.feng.dp.behavior.interpreter.productFinder;

/**
 * @Description 价格规格参数实现
 * @Author fengsy
 * @Date 8/14/22
 */
public class BelowPriceSpecification extends Specification {
    private float priceThreshold;

    public BelowPriceSpecification(float priceThreshold) {
        this.priceThreshold = priceThreshold;
    }

    public float getPriceThreshold() {
        return priceThreshold;
    }

    @Override
    boolean isSatisfiedBy(Product product) {
        return product.getPrice() <= getPriceThreshold();
    }
}
