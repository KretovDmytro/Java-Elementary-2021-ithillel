package task2224;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SquaredClass {

    private final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    private List<Integer> result;

    private final Function<Integer, Integer> squared = (inputValue) -> (int) Math.pow(inputValue, 2);

    public void findEvenNumbersAndSquareThem() {
        result = numbers.stream()
                .filter(inputValue -> inputValue % 2 == 0)
                .map(squared)
                .collect(Collectors.toList());
    }

    public void printListResult() {
        System.out.println(result);
    }
}