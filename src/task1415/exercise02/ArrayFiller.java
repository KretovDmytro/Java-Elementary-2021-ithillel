package task1415.exercise02;

import java.util.Arrays;

public class ArrayFiller implements Runnable {

    private String[] array = new String[20_0];

    @Override
    public void run() {
        fillArray();
        printArray();
    }

    private void fillArray() {
        for (int i = 0; i < array.length; i++) {
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

    private void printArray() {
        System.out.println(Arrays.toString(array));
    }
}

//    private String divisionByThreeWithoutRemainder(int dividend) {
//        if (dividend % 3 == 0) {
//            return "Fizz";
//        } else {
//            return numberToString(dividend);
//        }
//    }
//
//    private String divisionByFiveWithoutRemainder(int dividend) {
//        if (dividend % 5 == 0) {
//            return "Buzz";
//        } else {
//            return numberToString(dividend);
//        }
//    }