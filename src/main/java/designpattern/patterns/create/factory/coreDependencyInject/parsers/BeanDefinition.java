package designpattern.patterns.create.factory.coreDependencyInject.parsers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;
    // 省略必要的getter/setter/constructors

    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public static enum Scope {
        SINGLETON, PROTOTYPE
    }

    public static class Builder {
        private boolean isRef;
        private Class type;
        private Object arg;

        public ConstructorArg build() {
            return new ConstructorArg(this);
        }

        public Builder setRef(boolean ref) {
            isRef = ref;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;

        ConstructorArg(Builder builder) {
            this.isRef = builder.isRef;
            this.type = builder.type;
            this.arg = builder.arg;
        }

        public boolean getIsRef() {
            return isRef;
        }

        public Class getType() {
            return type;
        }

        public Object getArg() {
            return arg;
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }
}