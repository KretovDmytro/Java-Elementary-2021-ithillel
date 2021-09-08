package task2224;

/**
 * @author Kretov D.V
 * @version С помощью Stream API отфильтровать только четные числа и сформировать новый список из квадратов их значений.
 * Input: [1, 2, 3, 4, 5]
 * Output: [4, 16]
 */

public class Start {

    public static void main(String[] args) {

        //01
        SquaredClass squaredClass = new SquaredClass();
        squaredClass.findEvenNumbersAndSquareThem();
        squaredClass.printListResult();

        //02
        ClassPredicat classPredicat = new ClassPredicat("!", "ASD", "tyu", "fgh", "dfg", "cvb", "wer", "asd", "asd", "dfsdf", "gg", "ffFF", "FFF", "ddd", "sss", "SSS");


    }
}