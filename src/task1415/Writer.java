package task1415;

import java.util.List;

public class Writer implements Runnable {

    List<Integer> writerList;
    private final int DELAY;


    public Writer(int delay, List<Integer> writerList) {
        this.writerList = writerList;
        this.DELAY = delay;
    }

    @Override
    public void run() {
        addValuesInList();
    }

    private void addValuesInList() {
        try {
            Thread.sleep(DELAY);
            writerList.add(getIntNumber(0, 100));
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