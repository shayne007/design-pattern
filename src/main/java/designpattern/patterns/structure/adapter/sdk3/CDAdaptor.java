package designpattern.patterns.structure.adapter.sdk3;

/**
 * 适配器类,命名不一定非得末尾带Adaptor
 * 
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class CDAdaptor extends CD implements ITarget {
    /**
     * this method encapsulated a static method extends from third-party class CD which can be more testable
     */
    @Override
    public void function1() {
        staticFunction1();
    }

    /**
     * this method renamed a ugly naming function in third-party parent class
     */
    @Override
    public void function2() {
        super.uglyNamingFucntion2();
    }

    /**
     * this method used a wrapper class as a param
     * 
     * @param paramsWrapper
     */
    @Override
    public void function3(ParamsWrapperDefinition paramsWrapper) {
        super.tooManyParamsFunction3(paramsWrapper.getParamA(), paramsWrapper.getParamB(), paramsWrapper.getParamC());
    }

    /**
     * this method reimplement the method extends from parent class
     */
    @Override
    public void function4() {
        // ...reimplement it...
    }
}
