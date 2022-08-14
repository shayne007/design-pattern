package com.feng.dp.behavior.interpreter.productFinder;

/**
 * @Description 规格参数接口
 * @Author fengsy
 * @Date 8/14/22
 */
public abstract class Specification {
    /**
     * 是否满足规格参数要求
     * 
     * @param product
     *            产品
     * @return 是否满足
     */
    abstract boolean isSatisfiedBy(Product product);
}
