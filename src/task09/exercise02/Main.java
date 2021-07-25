package task09.exercise02;

/**
 * @author Kretov D.V
 * @version Написать метод, который принимает на вход список строк с дубликатами и возращает список из уникальных значений.
 * Напишите 2 его версии - с использованием Set и без.
 * Входящий список изменять нельзя.
 */

public class Main {

    public static void main(String[] args) {

        DuplicatLists object = new DuplicatLists();

        object.addToTheList("qwerty", "qwerty", "qwerty1", "ASD", "ASD", "ASD", " . ", "ASD", "2", "2", "2", "puc", "2s", "2s"); // add

        System.out.println("check " + object.stringList); // check
        System.out.println("With \"Set\": " + object.removeDuplicatesWithSet(object.stringList));
        System.out.println("Without \"Set\": " + object.removeDuplicatesWithoutSet(object.stringList));
        System.out.println("check " + object.stringList); // check
    }
}
