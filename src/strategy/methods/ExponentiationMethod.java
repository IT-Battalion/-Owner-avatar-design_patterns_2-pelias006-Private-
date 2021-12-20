package strategy.methods;

import strategy.CalculationMethod;

/**
 * This one of the 5 Calculation Methods.
 *
 * @author Patrick Elias
 * @version 2021-12-20
 */
public class ExponentiationMethod implements CalculationMethod {
    @Override
    public float calculate(float a, float b) {
        return (float) Math.pow(a, b);
    }

    @Override
    public long calculate(long a, long b) {
        return (long) Math.pow(a, b);
    }

    @Override
    public int calculate(int a, int b) {
        return (int) Math.pow(a, b);
    }

    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}
