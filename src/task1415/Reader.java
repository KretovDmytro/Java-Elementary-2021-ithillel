package task1415;

import java.util.List;

public class Reader implements Runnable {

    List<Integer> readerList;
    private final int DELAY;

    public Reader(int delay, List<Integer> readerList) {
        this.readerList = readerList;
        this.DELAY = delay;
    }

    @Override
    public void run() {
        checkIfTheListIsEmpty();
    }

    private void checkIfTheListIsEmpty() {
        try {
            Thread.sleep(DELAY);
            if (readerList.size() > 0) {
                System.out.println("List is not empty: " + readerList + " Delete all this elements");
                readerList.clear();
            } else {
                System.out.println("now this list is empty");
            }
            checkIfTheListIsEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}