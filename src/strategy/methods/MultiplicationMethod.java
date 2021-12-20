package strategy.methods;

import strategy.CalculationMethod;

/**
 * This one of the 5 Calculation Methods.
 *
 * @author Patrick Elias
 * @version 2021-12-20
 */
public class MultiplicationMethod implements CalculationMethod {
    @Override
    public float calculate(float a, float b) {
        return a * b;
    }

    @Override
    public long calculate(long a, long b) {
        return a * b;
    }

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
