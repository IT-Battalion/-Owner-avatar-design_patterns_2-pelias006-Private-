package strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.methods.*;

public class CalculationTest {
    @Test
    public void testAdditionMethod() {
        CalculationMethod calculationMethod = new AdditionMethod();
        Evaluate evaluate = new Evaluate(calculationMethod);
        int res = evaluate.getCalculationMethod().calculate(20, 5);
        Assertions.assertEquals(res, 25);
    }

    @Test
    public void testSubtractionMethod() {
        CalculationMethod calculationMethod = new SubtractionMethod();
        Evaluate evaluate = new Evaluate(calculationMethod);
        int res = evaluate.getCalculationMethod().calculate(20, 5);
        Assertions.assertEquals(res, 15);
    }

    @Test
    public void testDivinationMethod() {
        CalculationMethod calculationMethod = new DivinationMethod();
        Evaluate evaluate = new Evaluate(calculationMethod);
        int res = evaluate.getCalculationMethod().calculate(20, 5);
        Assertions.assertEquals(res, 4);
    }

    @Test
    public void testExponentialMethod() {
        CalculationMethod calculationMethod = new ExponentiationMethod();
        Evaluate evaluate = new Evaluate(calculationMethod);
        int res = evaluate.getCalculationMethod().calculate(2, 2);
        Assertions.assertEquals(res, 4);
    }

    @Test
    public void testMultiplicationMethod() {
        CalculationMethod calculationMethod = new MultiplicationMethod();
        Evaluate evaluate = new Evaluate(calculationMethod);
        int res = evaluate.getCalculationMethod().calculate(4, 5);
        Assertions.assertEquals(res, 20);
    }
}
