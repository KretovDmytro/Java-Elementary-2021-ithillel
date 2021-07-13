package task08.exercise01;

/**
 * @author Kretov D.V
 * @version Напечатать в консоль элементы массива с помощью рекурсии.
 */

public class Main {

    private final int count = 0;
    private final int[] ar = new int[]{1, 5, 7, 89, 4, 7, 8, 9, 4, 5, 6, 1, 2, -3};

    public static void main(String[] args) {
        Main m = new Main();
        m.printArrayInRecursion(m.count, m.ar);
    }

    void printArrayInRecursion(int count, int[] ar) {
        System.out.print(ar[count] + ", ");
        count++;
        if (count < ar.length) {
            printArrayInRecursion(count, ar);
        }
    }
}
