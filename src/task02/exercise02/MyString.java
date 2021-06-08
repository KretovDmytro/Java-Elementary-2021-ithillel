package task02.exercise02;

/**
 * @author Kretov D.V
 * @version Написать метод, который принимает строку, удаляет из нее все символы в верхнем регистре
 * и возвращает ее перевернутую версию (без использования библиотечных методов)
 * in: "AbcdEf"
 * out: "fdcb"
 */

public class MyString {

    String startString = "Ab-*/++__OoOoOoO)*)@!(*#&%(*#8KQAascsdijf98wjjni23 09u2 3dwiuhfjIJAO*sfokjhof 8uEf";
    static String newString;

    public static void main(String[] args) {

        MyString myString = new MyString();

        newString = myString.deleteUpperCaseReversValue(myString.startString);
        myString.printInfo();
    }

    public void printInfo() {
        System.out.printf("The start value of the string: %s %n", startString);
        System.out.printf("The finish value of the string: %s", newString);
    }

    // основной метод
    // можно было всё в 1 засунуть, но ты говорил, чтоб метод делал 1 действие.
    // поэтому основной метод как в ТЗ- "принимает строку, удаляет из нее все символы в верхнем регистре и возвращает ее перевернутую версию".
    // а делается всё в нём 2 отдельными методами. 1 переводит строку в массив чаров, 2-й разварачивает и оставляет
    // тольок нижний реестр.
    public String deleteUpperCaseReversValue(String str) {
        return reversSmallLetters(convertStringToArray(str));
    }

    public char[] convertStringToArray(String str) {
        return str.toCharArray();
    }

    public String reversSmallLetters(char[] strToArray) {

        StringBuilder newStr = new StringBuilder();

        for (int i = strToArray.length - 1; i >= 0; i--) {
            if (Character.isLowerCase(strToArray[i])) {
                newStr.append(strToArray[i]);
            }
        }
        return newStr.toString();
    }
}
