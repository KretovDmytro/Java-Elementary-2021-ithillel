package task2224.exercise01;

/**
 * @author Kretov D.V
 * @version С помощью Stream API отфильтровать только четные числа и сформировать новый список из квадратов их значений.
 * Input: [1, 2, 3, 4, 5]
 * Output: [4, 16]
 */

public class Start {

    public static void main(String[] args) {
        SquaredClass squaredClass = new SquaredClass();
        squaredClass.findEvenNumbersAndSquareThem();
        squaredClass.printListResult();
    }
}