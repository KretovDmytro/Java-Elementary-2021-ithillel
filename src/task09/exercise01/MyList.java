package task09.exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {

    List<String> stringList = new ArrayList<>();

    public void addToTheList(String... string) {
        stringList.addAll(Arrays.asList(string));
    }

    public boolean isLengthMoreFour(String string) {
        return string.length() > 4;
    }

    public boolean isNumberInEndOnString(String string) {
        return string.matches("^.*\\d$");
    }

    public List<String> listCleaner(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String string : list) {
            if (!isLengthMoreFour(string) && !isNumberInEndOnString(string)) {
                newList.add(string);
            }
        }
        return newList;
    }
}


