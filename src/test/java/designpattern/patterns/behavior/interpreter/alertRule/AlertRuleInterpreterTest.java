package designpattern.patterns.behavior.interpreter.alertRule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlertRuleInterpreterTest {

    private AlertRuleInterpreter interpreter;
    private Map stats;

    @BeforeEach
    void setUp() {
        stats = new HashMap<>();
        stats.put("api_error_per_minute", 101L);
        stats.put("api_count_per_minute", 121L);
        stats.put("system_users_online", 88L);
    }

    @Test
    void interpreter_should_alert() {
        String rule = "api_error_per_minute > 100 || " +
                "api_count_per_minute < 30 && " +
                "system_resource_num > 100 && " +
                "system_users_online == 88";
        interpreter = new AlertRuleInterpreter(rule);
        boolean alert = interpreter.interpret(stats);
        assertEquals(true, alert);
    }

    @Test
    void interpreter_should_not_alert() {
        String rule = "api_error_per_minute == 100 || " +
                "api_count_per_minute < 30 && " +
                "system_resource_num > 100 && " +
                "system_users_online == 88";
        interpreter = new AlertRuleInterpreter(rule);
        boolean alert = interpreter.interpret(stats);
        assertEquals(false, alert);
    }
}