package com.feng.dp.behavior.interpreter.productFinder;

/**
 * @Description 颜色规格
 * @Author fengsy
 * @Date 8/14/22
 */
public class ColorSpecification extends Specification {
    private Color colorOfProductToFind;

    public ColorSpecification(Color colorOfProductToFind) {
        this.colorOfProductToFind = colorOfProductToFind;
    }

    public Color getColorOfProductToFind() {
        return colorOfProductToFind;
    }

    @Override
    boolean isSatisfiedBy(Product product) {
        return product.getColor().equals(getColorOfProductToFind());
    }
}
