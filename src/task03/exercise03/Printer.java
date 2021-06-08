package task03.exercise03;

import java.util.Arrays;

public class Printer {

    // входящий двумерный массив перегоняем в строку
    // replace - меняем символы по шаблону, где "]," пусть будет "]" и перегон каретки
    // substring - сносим первый символ
    // replace - редактируем последний символ
    // можно было без substring и пару раз прогнать replace "[[" на "[" и "]]" на "]". Понял єто когда писал коммент. так и сделал, убрал метод substring(1)
    public void printInfo(int[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("]]", "]").replace("[[", "["));
    }
}
