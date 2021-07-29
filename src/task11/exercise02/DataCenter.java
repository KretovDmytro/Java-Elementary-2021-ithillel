package task11.exercise02;

import java.util.*;

public class DataCenter {

    static Map<String, Integer> map = new HashMap<>();
    static List<String> stringList = new ArrayList<>();

    static public void add(String string) {
        stringList.add(string);
    }

    static public void fillTheMap() {
        for (String compareString : stringList) {
            int count = 0;
            for (String string : stringList) {
                if (compareString.equals(string)) {
                    count++;
                }
            }
            map.put(compareString, count);
        }
    }

    static public void toPrintTwoMostFrequentLines() {
        Integer tempValue = 0;
        String tempMax1 = "";
        String tempMax2 = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= tempValue) {
                tempValue = entry.getValue();
                tempMax2 = tempMax1;
                tempMax1 = entry.getKey();
            }
        }
        System.out.printf("Popular string is \"%s\" and \"%s\" ", tempMax1, tempMax2);
    }
}
