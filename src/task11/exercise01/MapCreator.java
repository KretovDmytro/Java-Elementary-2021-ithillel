package task11.exercise01;

import java.util.*;

public class MapCreator {

    Map<String, Integer> map = new HashMap<>();
    Map<Integer, String> invertedMap;

    List<String> strings = Arrays.asList("qwe", "wer", "ert", "rty", "tyu", "yui", "uio", "iop", "op", "p");
    List<Integer> integers = Arrays.asList(12, 234, 345, 345, 56, 236, 36, 34, 56, 345);

    public void fillMap(List<String> key, List<Integer> value) {

        Iterator<String> keyIterator = key.iterator();
        Iterator<Integer> valueIterator = value.iterator();

        while (keyIterator.hasNext() && valueIterator.hasNext()) {

            String stringKey = keyIterator.next();
            Integer valueInteger = valueIterator.next();

            map.put(stringKey, valueInteger);
        }
    }

    public Map<Integer, String> swapKeysAndValues(Map<String, Integer> map) {

        invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            invertedMap.put(value, key);
        }
        return invertedMap;
    }
}
