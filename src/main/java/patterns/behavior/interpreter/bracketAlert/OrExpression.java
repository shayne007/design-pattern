package patterns.behavior.interpreter.bracketAlert;

import patterns.behavior.interpreter.alertRule.AndExpression;
import patterns.behavior.interpreter.alertRule.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class OrExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String strOrExpression) {
        String[] andExpressions = strOrExpression.split("\\|\\|");
        for (String andExpr : andExpressions) {
            expressions.add(new AndExpression(andExpr));
        }
    }

    public OrExpression(List expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map stats) {
        for (Expression expr : expressions) {
            if (expr.interpret(stats)) {
                return true;
            }
        }
        return false;
    }
}
