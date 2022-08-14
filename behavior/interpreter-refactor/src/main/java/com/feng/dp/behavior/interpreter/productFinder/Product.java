package com.feng.dp.behavior.interpreter.productFinder;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description TODO
 * @Author fengsy
 * @Date 8/13/22
 */
@AllArgsConstructor
@Getter
public class Product {
    private String id;
    private String name;
    private Color color;
    private float price;
    private ProductSize size;

}
