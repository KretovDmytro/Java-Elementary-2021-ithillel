package task1617.exercise01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CatAndDog {

    public boolean compareDogAndCat(String checkString) {
        return howManyTimesDog(checkString) == howManyTimesCat(checkString);
    }

    private int howManyTimesDog(String inputString) {
        Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher(inputString);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println("Собак попалось в этой строке " + counter);
        return counter;
    }

    // наверное, правильно было бы сделать 1 метод с допустим массивом с 2 строками "dog" и "cat"
    // и не дублировать код похожими методами.

    private int howManyTimesCat(String inputString) {
        Pattern pattern = Pattern.compile("cat");
        Matcher matcher = pattern.matcher(inputString);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println("Кошек попалось в этой строке " + counter);
        return counter;
    }
}
