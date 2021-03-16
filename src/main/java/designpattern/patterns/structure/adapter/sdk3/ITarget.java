package designpattern.patterns.structure.adapter.sdk3;

// 使用适配器模式进行重构
public interface ITarget {
    void function1();

    void function2();

    void function3(ParamsWrapperDefinition paramsWrapper);

    void function4();

    // ...
}

class ParamsWrapperDefinition {
    private int paramA;
    private int paramB;
    private int paramC;

    public int getParamA() {
        return paramA;
    }

    public int getParamB() {
        return paramB;
    }

    public int getParamC() {
        return paramC;
    }
}