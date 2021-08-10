package task1415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataListCenter {

    List<Integer> integerList = new ArrayList<>();

    public DataListCenter(Integer... value) {
        Collections.addAll(integerList, value);
    }


}

