package task03.exercise02;

import java.util.Arrays;

/**
 * @author Kretov D.V
 * @version Написать метод. Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
 * Вернуть отсортированный массив который состоит из квадратов значений.
 * Не использовать при этом стандартный метод sort.
 * Пример:
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 */

public class Sorter {

    private int[] startArray;

    public Sorter(int[] startArray) {
        this.startArray = startArray;
    }

    public static void main(String[] args) {

        Sorter sorter = new Sorter(new int[]{-7, -4, -1, 0, 3, 10, 11});
        String startArray = Arrays.toString(sorter.startArray);
        int[] newArray = sorter.sortArray(sorter.startArray);
        sorter.printInfo(newArray, startArray);
    }

    private void printInfo(int[] array, String startArray) {
        System.out.printf("Input: %s %n", startArray);
        System.out.printf("Output: %s %n", Arrays.toString(array));
    }

    private int[] sortArray(int[] array) {

        squaring(array); // возвели элементы массива в квадрат

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int variable = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = variable;
                }
            }
        }
        return array;
    }

    private void squaring(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2); // or array[i] *= array[i];
        }
    }
}



