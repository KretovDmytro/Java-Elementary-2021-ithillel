package task1415.exercise01;

import java.util.List;

public class Writer implements Runnable {

    List<Integer> writerList;
    private final int DELAY;
    private final int MAX_VALUE;
    private final int MIN_VALUE;


    public Writer(int minValue, int maxValue, int delay, List<Integer> writerList) {
        this.writerList = writerList;
        this.DELAY = delay;
        this.MIN_VALUE = minValue;
        this.MAX_VALUE = maxValue;
    }

    @Override
    public void run() {
        addValuesInList();
    }

    private void addValuesInList() {
        try {
            Thread.sleep(DELAY);
            writerList.add(getIntNumber(MIN_VALUE, MAX_VALUE));
            System.out.println("Список заполнен: " + writerList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addValuesInList();
    }

    private int getIntNumber(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}