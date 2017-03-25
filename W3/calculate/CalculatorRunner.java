package au.edu.rmit.calculate;

/**
 * Created by alexj on 16/3/17.
 */
public final class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 6);
        System.out.println("Addition: " + calc.add());
    }
}
