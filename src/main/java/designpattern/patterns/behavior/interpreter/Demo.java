package designpattern.patterns.behavior.interpreter;

/**
 * @author fengsy
 * @date 11/11/20
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        long result = new ExpressionInterpreter().interpret("8 3 2 4 - + *");
        System.out.println(result);

    }
}
