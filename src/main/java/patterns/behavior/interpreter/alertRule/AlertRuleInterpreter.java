package patterns.behavior.interpreter.alertRule;

import java.util.Map;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map stats) {
        return expression.interpret(stats);
    }
}
