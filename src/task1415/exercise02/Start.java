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

        ArrayFiller arrayFiller = new ArrayFiller();

        Thread thread = new Thread(arrayFiller);

        thread.start();
    }
}
