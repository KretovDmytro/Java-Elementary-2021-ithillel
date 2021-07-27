package task11.exercise01;

/**
 * @author Kretov D.V
 * @version Добавить в карту Map<String, Integer> 10 записей. Поменять местами ключи и значения (ключи становятся значениями, значения становятся ключами).
 * Количество записей в карте после перестановки может измениться.
 */

public class Start {

    public static void main(String[] args) {

        MapCreator mapCreator = new MapCreator();

        mapCreator.fillMap(mapCreator.strings, mapCreator.integers);

        System.out.println("Print start list: " + mapCreator.map);

        System.out.println("Start list size: " + mapCreator.map.size());

        System.out.println("\n" + "Print finish list: " + mapCreator.swapKeysAndValues(mapCreator.map));

        System.out.println("Finish list size: " + mapCreator.invertedMap.size());
    }
}
