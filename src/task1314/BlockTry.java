package task1314;

/* Написать блок try, внутри которого из массива случайных чисел берется 2 случайных числа и первое делится на второе.
Нужно обработать ситуации, когда второе число является 0 (ArithmeticalException) и когда индексы выходят за рамки массива (ArrayIndexOutOfBoundsException).
Если была попытка деления на 0, то внутри catch нужно взять два других числа из массива и попробовать разделить еще раз, также ожидая исключение.
 */

import java.util.Arrays;

public class BlockTry {

    private int[] array;
    private int dividend;
    private int divider;
    private double quotient;
    private int counter = 1;

    public BlockTry() {
        this.array = new int[getIntNumber(1, 25)];
        fillArray();
    }

    public void divideAnyTwoArrayValues() {
        try {
            takeTwoNumbersFromTheArray();
            quotient = dividend / divider;
            System.out.println("Разделить получилось без проблем " + quotient);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Вышли за рамки массива при выборе элемента для делимого или делителя " + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("біла попітка деления на ноль " + ex.getMessage());
            System.out.println("попітка " + counter++ + " провалена");
            divideAnyTwoArrayValues();
        }
    }

    public void divideAnyTwoArrayValues2() throws DivideByZeroException {
        takeTwoNumbersFromTheArray();
        if (divider == 0) {
            throw new DivideByZeroException("Делимое равняется нулю, ошибочка вышла");
        } else {
            System.out.println("Поделить получилось: " + dividend / divider);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    private void takeTwoNumbersFromTheArray() throws ArrayIndexOutOfBoundsException {
        dividend = array[getIntNumber(0, 25)];
        divider = array[getIntNumber(0, 25)];
        System.out.println("ДЕлимое " + dividend);
        System.out.println("Делитель " + divider);
    }

    private int getIntNumber(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = getIntNumber(0, 3);
        }
    }
}