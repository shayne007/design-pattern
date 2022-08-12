package designpattern.patterns.behavior.interpreter.alertRule;

import java.util.Map;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new BracketExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
