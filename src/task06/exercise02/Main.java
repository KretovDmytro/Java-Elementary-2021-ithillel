package task06.exercise02;

/**
 * @author Kretov D.V
 * @version Написать метод, который принимает строку и возвращает средний символ как строку. Если в строке четное кол-во символов, то возвращать символы слева и справа от центра.
 * Input: abcde. Output: c
 * Input: abcd. Output: bc
 * <p>
 * Написать метод, который принимает строку и меняет ее половины местами. Если в строке нечетное кол-во символов, то средний символ остается на месте:
 * Input: abcd. Output: cdab
 * Input: abcde. Output: decab
 */

public class Main {

    public static void main(String[] args) {

        MethodList methodList = new MethodList(Inputter.inputString());

        System.out.printf("%s %n", methodList.returnTheMiddleCharacter(methodList.inputSting));
        System.out.printf("%s", methodList.swapHalvesOfTheLine(methodList.inputSting));
    }
}
