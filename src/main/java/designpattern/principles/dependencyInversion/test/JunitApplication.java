package designpattern.principles.dependencyInversion.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public class JunitApplication {
    private static final List<TestCase> testCases = new ArrayList<>();

    public static void register(TestCase testCase) {
        testCases.add(testCase);
    }

    public static final void main(String[] args) {

        for (TestCase testCase : testCases) {
            testCase.run();
        }
    }
}