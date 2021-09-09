package task2224;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ClassPredicate {

    private final List<String> listString;

    private final Predicate<String> iStartsFromUpperCase = str -> Character.isUpperCase(str.charAt(0));

    private final Predicate<List<String>> isMoreThanTwoStringsStartsFromCapital = (list) ->
            list.stream()
                    .filter(iStartsFromUpperCase)
                    .count() > 2;

    public ClassPredicate(String... str) {
        this.listString = Arrays.asList(str);
    }

    public boolean check() {
        return isMoreThanTwoStringsStartsFromCapital.test(listString);
    }
}