package task1415.exercise02;

import java.util.Arrays;

public class ArrayFiller implements Runnable {

    private String[] array = new String[20_000_000];

    @Override
    public void run() {
        fillArray();
    }

    private void fillArray() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = checkForRemainder(i);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Затраченое времячко с одним потоком: " + (finishTime - startTime));
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