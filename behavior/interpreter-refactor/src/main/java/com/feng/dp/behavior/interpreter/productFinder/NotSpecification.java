package com.feng.dp.behavior.interpreter.productFinder;

/**
 * @Description 非操作 规格实现
 * @Author fengsy
 * @Date 8/14/22
 */
public class NotSpecification extends Specification {
    private Specification specToNegate;

    public NotSpecification(Specification specToNegate) {
        this.specToNegate = specToNegate;
    }

    @Override
    boolean isSatisfiedBy(Product product) {
        return !specToNegate.isSatisfiedBy(product);
    }
}
