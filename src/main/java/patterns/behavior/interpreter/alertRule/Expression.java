package patterns.behavior.interpreter.alertRule;

import java.util.Map;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}


