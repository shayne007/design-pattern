package designpattern.patterns.behavior.interpreter.alertRule;

import java.util.Map;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class LessExpression implements Expression {
    private long value;
    private String key;

    public LessExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].trim().equals("<")) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }


    @Override

    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        long statValue = stats.get(key);
        return statValue > value;
    }
}
