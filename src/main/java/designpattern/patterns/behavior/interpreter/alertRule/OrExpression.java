package designpattern.patterns.behavior.interpreter.alertRule;

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
            Expression expression = new AndExpression(andExpr);
            expressions.add(expression);
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
