package task01.strings;

/**
 * @author Kretov D.V
 * @version Написать метод, который принимает массив String и возвращает String,
 * в котором все строки из массива объединены в одну строку через разделитель “|”.
 */

public class Concat {

    String[] stringArray = {"do", "re", "me"};

    public static void main(String[] args) {

        Concat concat = new Concat();

        String myString = concat.concatenateArrayString(concat.stringArray);
        System.out.printf("%s", myString);
    }

    public String concatenateArrayString(String[] myString) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < myString.length; i++) {
            newString.append("|").append(myString[i]);
        }
        return newString.delete(0, 1).toString();
    }
}