package task1415;

public class Start {

    public static void main(String[] args) {

        DataListCenter dataListCenter = new DataListCenter(1, 2, 0, 4, 0, 64, 5, -1);

        Reader reader = new Reader(1000, dataListCenter.integerList);
        Writer writer = new Writer(2500, dataListCenter.integerList);

        Thread thread = new Thread(reader);
        Thread thread2 = new Thread(writer);

        thread.start();
        thread2.start();
    }
}