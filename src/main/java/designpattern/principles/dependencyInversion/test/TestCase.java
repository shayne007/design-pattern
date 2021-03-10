package designpattern.principles.dependencyInversion.test;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public abstract class TestCase {
    public void run() {
        if (doTest()) {
            System.out.println("Test succeed.");
        } else {
            System.out.println("Test failed.");
        }
    }

    public abstract boolean doTest();
}
