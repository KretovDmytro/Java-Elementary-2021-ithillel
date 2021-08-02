package task1617.exercise03;

/**
 * @author Kretov D.V
 * @version Дано 2 строки - base и remove, вернуть версию строки base, из которой удалены все включения строки remove (регистр не важен).
 * Предполагаем, что строка remove всегда имеет длину 1 или больше.
 * Удалить только не пересекающиеся участки, например удаляя из "xxx" строку "xx" останется просто "x".
 * Пример:
 * withoutString("Hello there", "llo") -> "He there"
 * withoutString("Hello there", "e") -> "Hllo thr"
 * withoutString("Hello there", "x") -> "Hello there"
 */

public class Start {
    public static void main(String[] args) {
        BaseRemove baseRemove = new BaseRemove("Hello thereee", "ee");
        System.out.println(baseRemove.modifyString());
    }
}
