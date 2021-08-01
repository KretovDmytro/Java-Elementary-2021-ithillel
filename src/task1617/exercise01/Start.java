package task1617.exercise01;

/**
 * @author Kretov D.V
 * @version Написать метод, который принимает строку и возвращает true если строки "cat" и "dog" встречаются во входной строке одинаковое количество раз.
 * Пример:
 * catDog("catdog") -> true
 * catDog("catcat") -> false
 * catDog("1cat1cadodog") -> true
 */

public class Start {

    public static void main(String[] args) {

        InputString inputString = new InputString("1cat1cadodog d o g cat");

        CatAndDog catAndDog = new CatAndDog();

        System.out.println(catAndDog.compareDogAndCat(inputString.inpString));
    }
}
