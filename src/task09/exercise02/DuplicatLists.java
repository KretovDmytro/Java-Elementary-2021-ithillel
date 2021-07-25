package task09.exercise02;

import java.util.*;

public class DuplicatLists {

    List<String> stringList = new ArrayList<>();

    public void addToTheList(String... string) {
        stringList.addAll(Arrays.asList(string));
    }

    public List<String> removeDuplicatesWithSet(List<String> list) {
        Set<String> newList = new HashSet<>(list);
        return new ArrayList<>(newList);
    }

    public List<String> removeDuplicatesWithoutSet(List<String> list) {

        List<String> newList = new ArrayList<>(list);

        Iterator<String> iterator = newList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            int count = 0;
            for (String value : newList) {
                if (s.equals(value)) {
                    count++;
                    if (count > 1) {
                        iterator.remove();
                        break;
                    }
                }
            }
        }
        return newList;
    }
}
