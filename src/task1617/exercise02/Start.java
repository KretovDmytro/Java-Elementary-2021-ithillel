package task1617.exercise02;

/**
 * @author Kretov D.V
 * @version Дан массив не пустых строк.
 * Верните Map<String, String>, где ключами будут первые символы строк, а значениями - все строки,
 * которые начинаются с этого символа в том порядке, в каком они идут в массиве
 * Пример:
 * firstChar(["salt", "tea", "soda", "toast"]) -> {"s": "saltsoda", "t": "teatoast"}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) -> {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 * firstChar([]) -> {}
 */

public class Start {

    public static void main(String[] args) {

        ArrayString arrayString = new ArrayString("salt", "tea", "soda", "toast", "s1111", "s2222", "654564");

        MapStringString mapStringString = new MapStringString();

        System.out.println(mapStringString.makeMap(arrayString.array));
    }
}
