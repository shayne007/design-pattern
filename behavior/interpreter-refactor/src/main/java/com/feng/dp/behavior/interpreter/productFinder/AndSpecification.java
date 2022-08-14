package com.feng.dp.behavior.interpreter.productFinder;

/**
 * @Description 与操作 规格实现
 * @Author fengsy
 * @Date 8/14/22
 */
public class AndSpecification extends Specification {
    private Specification augend, addend;

    public AndSpecification(Specification augend, Specification addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Specification getAugend() {
        return augend;
    }

    public Specification getAddend() {
        return addend;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return getAugend().isSatisfiedBy(product) && getAddend().isSatisfiedBy(product);
    }
}
