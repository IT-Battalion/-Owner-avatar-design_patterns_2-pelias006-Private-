package strategy;

/**
 * This class represents the Strategy.
 *
 * @author Patrick Elias
 * @version 2021-12-20
 */
public class Evaluate {
    private final CalculationMethod calculationMethod;

    public Evaluate(CalculationMethod calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }
}
