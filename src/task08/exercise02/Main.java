package task08.exercise02;

import java.util.Arrays;

public class Main implements IntList {

    private Integer[] ar = new Integer[13];

    public static void main(String[] args) {
        Main mainObject = new Main();

        mainObject.add(2);
        System.out.printf("%n%n");
        mainObject.insert(5, -15);
        System.out.printf("%n%n");

    }

    @Override
    public void add(int i) {
//        System.out.println(Arrays.toString(ar) + " Start array");
//        for (; i < ar.length; i++) {
//            int temporaryValue = ar[i];
//            int temporaryValue2 = ar[i + 1];
//            ar[2+1] = temporaryValue;
//            temporaryValue = temporaryValue2;
//        }
//        ar[i] = 55;
//        System.out.println(Arrays.toString(ar) + " Array after method \"add\"");
    }

    @Override
    public void insert(int index, int value) {
        System.out.println(Arrays.toString(ar) + " Start array");
        ar[index] = value;
        System.out.println(Arrays.toString(ar) + " Array after method \"insert\" ");
    }

    @Override
    public void set(int index, int value) {
        System.out.println(Arrays.toString(ar) + " Start array");
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public int getByIndex(int index) {
        return 0;
    }

    @Override
    public Integer getIndexByValue(int value) {
        return null;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public void removeValue(int value) {

    }

    @Override
    public void removeByIndex(int index) {

    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }
}
