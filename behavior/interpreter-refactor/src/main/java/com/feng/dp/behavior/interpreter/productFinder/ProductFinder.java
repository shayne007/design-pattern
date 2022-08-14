package com.feng.dp.behavior.interpreter.productFinder;

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

    public List<Product> selectBy(Specification spec) {
        return this.repository.productList.stream().filter(product -> spec.isSatisfiedBy(product))
            .collect(Collectors.toList());
    }
}
