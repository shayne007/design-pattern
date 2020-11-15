package patterns.behavior.interpreter.alertRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class AndExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public AndExpression(String strAndExpression) {
        String[] strExpressions = strAndExpression.split("&&");
        for (String strExpr : strExpressions) {
            if (strExpr.contains(">")) {
                expressions.add(new GreaterExpression(strExpr));
            } else if (strExpr.contains("<")) {
                expressions.add(new LessExpression(strExpr));
            } else if (strExpr.contains("==")) {
                expressions.add(new EqualExpression(strExpr));
            } else {
                throw new RuntimeException("Expression is invalid: " + strAndExpression);
            }
        }
    }

    public AndExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map stats) {
        for (Expression expr : expressions) {
            if (!expr.interpret(stats)) {
                return false;
            }
        }
        return true;
    }
}
