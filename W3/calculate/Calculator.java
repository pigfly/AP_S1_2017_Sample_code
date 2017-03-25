package au.edu.rmit.calculate;

/**
 * Created by alexj on 16/3/17.
 */
public final class Calculator implements CalculatorProtocol {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double add() {
        return num1 + num2;
    }

    @Override
    public double subtract() {
        return num1 - num2;
    }

    @Override
    public double multiply() {
        return num1 * num2;
    }

    @Override
    public double divide() {
        return num1 / num2;
    }

    @Override
    public double exponent() {
        return Math.pow(num1, num2);
    }
}
