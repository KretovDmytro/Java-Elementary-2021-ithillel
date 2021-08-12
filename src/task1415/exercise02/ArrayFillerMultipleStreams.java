package task1415.exercise02;

import java.util.Arrays;

public class ArrayFillerMultipleStreams implements Runnable {

    private String[] array = new String[20_000_000];
    private int lowerLimit;
    private int upperLimit;

    public ArrayFillerMultipleStreams(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public void run() {
        fillArray();
    }

    private void fillArray() {
        for (int i = lowerLimit; i < upperLimit; i++) {
            array[i] = checkForRemainder(i);
        }
    }

    private String checkForRemainder(int dividend) {
        if (dividend % 5 == 0 & dividend % 3 == 0) {
            return "FizzBuzz";
        } else if (dividend % 5 == 0) {
            return "Buzz";
        } else if (dividend % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(dividend);
        }
    }

    // был для проверки заполняемости массива
    private void printArray() {
        System.out.println(Arrays.toString(array));
    }
}