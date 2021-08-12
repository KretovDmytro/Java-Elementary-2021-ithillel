package task1415.exercise02;

/**
 * @author Kretov D.V
 * @version С помощью многопоточности заполнить массива строк из 20 млн элементов.
 * Если индекс делится на 3 без остатка - записать в ячейку "Fizz",
 * если делится на 5 без остатка - "Buzz", если делится и на 3 и на 5 - "FizzBuzz".
 * Во всех остальных случаях записать в ячейку строковое представление ее индекса (4 -> "4").
 * Сравнить время выполнения программы с одним потоком и с несколькими.
 * Количество потоков на ваше усмотрение.
 */

public class Start {

    public static void main(String[] args) {

        // fill array with one flows
        ArrayFiller arrayFiller = new ArrayFiller();

        Thread thread = new Thread(arrayFiller);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // with three flows
        ArrayFillerMultipleStreams arrayFillerMultipleStreams = new ArrayFillerMultipleStreams(0, 7_000_000);
        ArrayFillerMultipleStreams arrayFillerMultipleStreams2 = new ArrayFillerMultipleStreams(7_000_001, 14_000_000);
        ArrayFillerMultipleStreams arrayFillerMultipleStreams3 = new ArrayFillerMultipleStreams(14_000_001, 20_000_000);

        Thread threadMulti = new Thread(arrayFillerMultipleStreams);
        Thread threadMulti2 = new Thread(arrayFillerMultipleStreams2);
        Thread threadMulti3 = new Thread(arrayFillerMultipleStreams3);

        long startTime = System.currentTimeMillis();
        multiStart(threadMulti, threadMulti2, threadMulti3);
        long finishTime = System.currentTimeMillis();
        System.out.println("Затраченое времячко с тремя потоками: " + (finishTime - startTime));
    }

    private static void multiStart(Thread one, Thread two, Thread three) {
        one.start();
        two.start();
        three.start();
        try {
            three.join();
            two.join();
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}