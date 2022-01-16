package strategy;

/**
 * This class represents the Strategy.
 *
 * @author Patrick Elias
 * @version 2021-12-20
 */
public class Evaluate {
    private final CalculationMethod calculationMethod;
    private final int numberA;
    private final int numberB;

    public Evaluate(CalculationMethod calculationMethod, int numberA, int numberB) {
        this.calculationMethod = calculationMethod;
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }

    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }
}
