package task1516;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Kretov D.V
 * @version Дан массив из 10 млн целых чисел (программа сама заполняет его, без мнопоточности). Нужно посчитать среднее арифметическое с помощью многопоточности.
 * Вместо System.out.println используйте логирование - пример был показан на 16 лекции
 * Пошаговая логика решения:
 * 1. создаем массив целых чисел длиной 10 млн (если на компьютере не хватает оперативной памяти - можно уменьшить до 5 или 3)
 * 2. заполняем массив случайными числами (можно использовать Random или Math.random)
 * 3. пишем класс, который реализует Runnable. Класс должен принимать массив и 2 границы from и to. в методе run нужно посчитать среднее арифметическое в массиве между from и to и сохранить результат в поле класса.
 * 4. в main методе создаем например 4 потока и 4 объекта из п.3. Каждому объекту из п3. передаем массив из п.1 и разные границы, чтобы каждый поток считал среднее арифметическое для разных частей массива. Например, если массив из 10 млн, то каждый поток считает только для 2.5 млн
 * 5. запускаем потоки и ожидаем их завершения (метод join у объектов Thread)
 * 6. берем посчитаные средние арифметические для частей массив (например, для 10 млн, который был разделен на 4 части - будет 4 средних арифметических) и считаем среднее значение средни них (отдельный поток не нужен)
 */

public class Start {
    public static void main(String[] args) {

        ArrayClass arrayClass = new ArrayClass(0, 100);

        Average a1 = new Average(0, 5_000_000, arrayClass.getArray());
        Average a2 = new Average(5_000_001, 10_000_000, arrayClass.getArray());
        Average a3 = new Average(10_000_001, 15_000_000, arrayClass.getArray());
        Average a4 = new Average(15_000_001, 20_000_000, arrayClass.getArray());

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);
        Thread t4 = new Thread(a4);

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String averageStr = a1.calculateTheTotalArithmeticMean(a1.getAverage(),
                a2.getAverage(),
                a3.getAverage(),
                a4.getAverage());

        Logger logger = Logger.getLogger(Start.class.getName());
        logger.log(Level.INFO, "the total arithmetic mean in equals: " + averageStr);

        long finishTime = System.currentTimeMillis();
        String elapsedTime = String.valueOf(finishTime - startTime);
        logger.log(Level.INFO, "milliseconds have passed: " + elapsedTime + " ms");
    }
}
