package com.feng.dp.behavior.interpreter.productFinder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 产品存储仓实现
 * @Author fengsy
 * @Date 8/13/22
 */
public class ProductRepository {

    List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }
}
