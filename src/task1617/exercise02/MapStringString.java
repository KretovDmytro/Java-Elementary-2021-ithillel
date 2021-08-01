package task1617.exercise02;

import java.util.HashMap;
import java.util.Map;

public class MapStringString {

    Map<String, String> map = new HashMap<>();

    public Map<String, String> makeMap(String[] stringValue) {

        for (String str : stringValue) {
            char c = str.charAt(0);
            String firstSymbolStrValue = Character.toString(c);
            StringBuilder newString = new StringBuilder();

            for (String str2 : stringValue) {
                char c2 = str2.charAt(0);
                String concatStringValue = Character.toString(c2);
                if (firstSymbolStrValue.equals(concatStringValue)) {
                    newString.append(str2);
                }
            }
            map.put(firstSymbolStrValue, newString.toString());
        }
        return map;
    }
}