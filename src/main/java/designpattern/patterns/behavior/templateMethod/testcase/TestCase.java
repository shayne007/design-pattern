package designpattern.patterns.behavior.templateMethod.testcase;


import junit.framework.Assert;
import junit.framework.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */
public abstract class TestCase extends Assert implements Test {

    private String fName;

    public void runBare() throws Throwable {
        Throwable exception = null;
        setUp();
        try {
            runTest();
        } catch (Throwable running) {
            exception = running;
        } finally {
            try {
                tearDown();
            } catch (Throwable tearingDown) {
                if (exception == null) exception = tearingDown;
            }
        }
        if (exception != null) throw exception;
    }

    /**
     * runTest()为模板方法runBare的扩展点，使用反射根据方法名称fName获取具体的测试方法，然后调用执行
     */
    protected void runTest() {
        assertNotNull("TestCase.fName cannot be null", this.fName);
        Method runMethod = null;

        try {
            runMethod = this.getClass().getMethod(this.fName, (Class[]) null);
        } catch (NoSuchMethodException var5) {
            fail("Method \"" + this.fName + "\" not found");
        }

        if (!Modifier.isPublic(runMethod.getModifiers())) {
            fail("Method \"" + this.fName + "\" should be public");
        }

        try {
            runMethod.invoke(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets up the fixture, for example, open a network connection.
     * This method is called before a test is executed.
     */
    protected void setUp() throws Exception {
    }

    /**
     * Tears down the fixture, for example, close a network connection.
     * This method is called after a test is executed.
     */
    protected void tearDown() throws Exception {
    }
}