package designpattern.patterns.behavior.interpreter.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ExpressionInterpreterTest {
    private ExpressionInterpreter interpreter;

    @BeforeEach
    void setUp() {
        interpreter = new ExpressionInterpreter();
    }

    @Test
    void interpreter_should_work() {
        long result = interpreter.interpret("8 3 2 4 - + *");
        assertEquals((8 - 3 + 2) * 4, result);
    }

    @Test()
    void interpreter_should_error() {
        long result = interpreter.interpret("8 3 2 3 - + /");
        assertEquals((8 - 3 + 2) / 3, result);
    }
}