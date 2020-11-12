package patterns.behavior.interpreter.bracketAlert;


import java.util.Map;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new StackExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
