package task06.exercise01;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.printf("%s", calc.plus(7, 8));
    }

    public int plus(int a, int b) {
        return a + b;
    }
}
