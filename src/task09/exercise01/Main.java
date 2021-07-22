package task09.exercise01;

/**
 * @author Kretov D.V
 * @version Написать метод, который принимает на вход список строк, удаляет из него все строки, длина которых > 4 или которые заканчиваются на цифру, и возвращает его.
 * Входящий список изменять нельзя.
 */

public class Main {

    public static void main(String[] args) {

        MyList object = new MyList();

        object.addToTheList("qwerty", "qw", "qwerty1", "ASD", "2", "zx0", " . ", " 2", ",,2", "puc", "2s"); // add

        System.out.println(object.listCleaner(object.stringList));
    }
}
