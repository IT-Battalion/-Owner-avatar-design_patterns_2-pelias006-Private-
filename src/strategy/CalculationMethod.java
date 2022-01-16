package strategy;

/**
 * This is the Strategy Interface for calculations.
 *
 * @author Patrick Elias
 * @version 2021-12-20
 */
public interface CalculationMethod {
    float calculate(float a, float b);
    long calculate(long a, long b);
    int calculate(int a, int b);
    double calculate(double a, double b);
}
