package task1516;

public class ArrayClass {

    private int[] array = new int[20_000_000];

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
}