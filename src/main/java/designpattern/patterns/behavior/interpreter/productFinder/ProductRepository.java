package designpattern.patterns.behavior.interpreter.productFinder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author fengsy
 * @Date 8/13/22
 */
public class ProductRepository {

    List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }
}
