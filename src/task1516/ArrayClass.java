package task1516;

import java.util.Arrays;

public class ArrayClass {

    private int[] array = new int[4000000];

    public ArrayClass(int minValue, int maxValue) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
        }
    }

    public ArrayClass() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public int[] getArray() {
        return array;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}