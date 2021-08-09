package task1314;

/**
 * @author Kretov D.V
 * @version Написать метод, который принимает 2 строки.
 * Если обе строки заканчиваются на одинаковый символ - бросать исключение IllegalArgumentException, в конструктор исключения передавать символ на который заканчиваются строки.
 * Вызвать этот метод, поймать исключение и вывести в консоль его сообщение (метод getMessage).
 */

public class LastSymbol {

    public static void compareLastSymbols(String string1, String string2) throws IllegalArgumentException {
        if (getLastSymbol(string1) == getLastSymbol(string2)) {
            throw new IllegalArgumentException(String.valueOf(getLastSymbol(string2)));
        } else {
            System.out.println("The last characters are not similar");
        }
    }

    private static char getLastSymbol(String str) {
        char[] strArray = str.toCharArray();
        return strArray[strArray.length - 1];
    }
}