package task06.exercise01;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.printf("%s", calc.plus(new int[]{1, 2, 3}));
    }

    public int plus(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
