package task06.exercise01;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.printf("%s", calc.multiply(7.4, 8.6));
        System.out.printf("%s", calc.plus(new int[]{1, 2, 3}));
    }

    public double multiply(double a, double b) {
        return a + b;
    }

    public int plus(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
