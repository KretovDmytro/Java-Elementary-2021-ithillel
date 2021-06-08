package task01.array;

import java.util.Random;

/**
 * @author Kretov D.V
 * @version Создать 2 массива случайного размера (от 5 до 15).
 * Один заполнить случайными четными числами от 0 до 100, другой – нечетными от 0 до 100.
 * Напечатать оба массива в консоль. Найти максимальный и минимальный элементы в них и напечатать их.
 */

public class Arrays {

    int[] notEven;
    int[] even;

    public static void main(String[] args) {
        Arrays arrays = new Arrays();

        arrays.createArray();
        arrays.fillEvenArray(arrays.even);
        arrays.fillNotEvenArray(arrays.notEven);
        arrays.showInfo(arrays.even);
        arrays.showInfo(arrays.notEven);
    }

    public void fillEvenArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int generatedNumber = rand.nextInt(102 / 2) * 2;
            if (generatedNumber == 0) {
                array[i] = generatedNumber + 2;
            } else array[i] = generatedNumber;
        }
    }

    public void fillNotEvenArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int generatedNumber = rand.nextInt((100 / 2) * 2);
            if (generatedNumber % 2 != 0) {
                array[i] = generatedNumber;
            } else if (generatedNumber == 0) {
                array[i] = generatedNumber + 1;
            } else array[i] = generatedNumber - 1;
        }
    }

    public void createArray() {
        notEven = new int[setlengthArray()];
        even = new int[setlengthArray()];
    }

    public int setlengthArray() {
        return (int) (5 + Math.random() * 11);
    }

    public void printArray(int[] array) {
        System.out.print("\n\nArray contains: ");
        for (int element : array) {
            System.out.printf("%s ", element);
        }
    }

    public void findTheMaximum(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.printf("\nMaximum value in array is: %s", max);
    }

    public void findTheMinimum(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.printf("\nMinimum value in array is: %s", min);
    }

    public void showInfo(int[] array) {
        printArray(array);
        findTheMinimum(array);
        findTheMaximum(array);
    }
}
