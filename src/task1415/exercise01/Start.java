package task1415.exercise01;

/**
 * @author Kretov D.V
 * @version Написать класс Reader, который реализует интерфейс Runnable.
 * Должен быть конструктор, который принимает список чисел.
 * В методе run() 1 раз в 1 секунду нужно проверять есть ли элементы в списке.
 * Если есть - печатать их в консоль и удалять (метод clear() у списка).
 * Если нет - печатать в консоль дату и сообщение "The list is empty".
 * Написать класс Writer, который реализует интерфейс Runnable.
 * Должен быть конструктор, который принимает список чисел.
 * В методе run() 1 раз в 2.5 секунды нужно добавлять случайные числа в список.
 * Создать список и объекты Reader и Writer, передать один и тот же список обоим.
 * Создать 1 поток для Reader и 1 для Writer, запустить их.
 */

public class Start {

    public static void main(String[] args) {

        DataListCenter dataListCenter = new DataListCenter(1, 2, 0, 4, 0, 64, 5, -1);

        Reader reader = new Reader(1000, dataListCenter.integerList);
        Writer writer = new Writer(0, 100, 2500, dataListCenter.integerList);

        Thread thread = new Thread(reader);
        Thread thread2 = new Thread(writer);

        thread.start();
        thread2.start();
    }
}