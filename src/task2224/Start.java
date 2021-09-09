package task2224;

/**
 * @author Kretov D.V
 * @version 1. С помощью Stream API отфильтровать только четные числа и сформировать новый список из квадратов их значений.
 * Input: [1, 2, 3, 4, 5]
 * Output: [4, 16]
 * <p>
 * 2. Написать функцию-Predicat (это функция из JDK, которая принимает одно значение и возвращает true/false, ее можно испольлозовать в Stream API меотде filter()).
 * Предикат должен принимать коллекцию строк (List<String>) и проверять содержится ли в ней больше 2 строк, которые начинаются с заглавной буквы (upper case).
 * Эту проверку также нужно сделать с помощью Stream API. Используйте функцию count() из Stream API
 * <p>
 * 3. Написать энам MathOperations со значениями PLUS, MINUS, DIVIDE, MULTIPLY.
 * Составить карту функций, ключи - значения энама. Значения - функции (BiFunction), которые выполняют соответствующие действия.
 * <p>
 * 4. Напишите Supplier-функцию (которая ничего не принимает, но возращает значение), которая рандомно возращает число от 0 до 10 с задержкой 500 мс.
 * С помощью этой функции создайте стрим (метод generate у интерфейса Stream). Возведите каждый элемент потока в 3 степень.
 * Если результат больше 100, то печатайте его в консоль. Ограничьте поток 100 элементами.
 */

public class Start {

    public static void main(String[] args) {

        //01
        SquaredClass squaredClass = new SquaredClass();
        squaredClass.findEvenNumbersAndSquareThem();
        squaredClass.printListResult();

        //02
        ClassPredicate classPredicate = new ClassPredicate("!", "ASD", "tyu", "fgh", "dfg", "cvb", "wer", "asd", "asd", "dfsdf", "gg", "ffFF", "FFF", "ddd", "sss", "SSS");
        System.out.println(classPredicate.check());

        //03
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        arithmeticOperations.createArithmeticOperationsMap();

        //04
        ClassSupplier classSupplier = new ClassSupplier();
        classSupplier.printIfResultIsMoreThan100();
    }
}