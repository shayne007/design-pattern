package designpattern.patterns.behavior.interpreter.alertRule;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Description 告警规则表达式支持括号栈实现
 * @Author fengsy
 * @Date 8/12/22
 */
public class BracketExpression implements Expression {

    private List<String> expList;

    public BracketExpression(String ruleExpression) {
        expList = ruleToExpList(ruleExpression);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        Deque<Boolean> boolStack = new LinkedList<>();
        Deque<String> logicStack = new LinkedList<>();
        logicStack.push("#");

        for (String strExpr : expList) {
            if (strExpr.contains(">")) {
                Expression expression = new GreaterExpression(strExpr);
                boolStack.push(expression.interpret(stats));
            } else if (strExpr.contains("<")) {
                Expression expression = new LessExpression(strExpr);
                boolStack.push(expression.interpret(stats));
            } else if (strExpr.contains("==")) {
                Expression expression = new EqualExpression(strExpr);
                boolStack.push(expression.interpret(stats));
            } else {
                String top = logicStack.getFirst();
                int icp = icp(strExpr);
                int isp = isp(top);
                if (icp < isp) {
                    Boolean b1 = boolStack.pop();
                    Boolean b2 = boolStack.pop();
                    logicStack.pop();
                    boolean b3;
                    switch (top) {
                        case "||":
                            b3 = b1 || b2;
                            break;
                        case "&&":
                            b3 = b1 && b2;
                            break;
                        default:
                            throw new RuntimeException("invalid logic: \"" + top + "\"");
                    }
                    boolStack.push(b3);
                } else if (icp == isp) {
                    logicStack.pop();
                } else {
                    logicStack.push(strExpr);
                }
            }
        }
        return boolStack.pop();
    }

    private List<String> ruleToExpList(String ruleExpression) {
        List<String> expList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = ruleExpression.toCharArray();
        int i = 0;
        while (i < chars.length) {
            char c = chars[i];
            if (c == '(' || c == ')' || c == '&' || c == '|') {
                String trim = sb.toString().trim();
                if (!trim.isEmpty()) {
                    expList.add(trim);
                    sb.setLength(0);
                }
                if (c == '(' || c == ')') {
                    expList.add(String.valueOf(c));
                    i++;
                } else if (c == '&') {
                    expList.add("&&");
                    i += 2;
                } else {
                    expList.add("||");
                    i += 2;
                }
            } else {
                sb.append(c);
                i++;
            }
        }
        String trim = sb.toString().trim();
        if (!trim.isEmpty()) {
            expList.add(trim);
        }
        expList.add("#");
        return expList;
    }

    // 栈内优先级
    private int isp(String ch) {
        switch (ch) {
            case "#":
                return 0;
            case "(":
                return 1;
            case "||":
                return 3;
            case "&&":
                return 5;
            case ")":
                return 8;
            default:
                throw new RuntimeException("invalid op: \"" + ch + "\"");
        }
    }

    // 栈外优先级
    private int icp(String ch) {
        switch (ch) {
            case "#":
                return 0;
            case "(":
                return 8;
            case "||":
                return 2;
            case "&&":
                return 4;
            case ")":
                return 1;
            default:
                throw new RuntimeException("invalid op: \"" + ch + "\"");
        }
    }

}