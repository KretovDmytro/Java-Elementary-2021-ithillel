package task06.exercise01;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.printf("%s", calc.multiply(7.4, 8.6));
    }

    public double multiply(double a, double b) {
        return a + b;
    }
}
