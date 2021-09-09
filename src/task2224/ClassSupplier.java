package task2224;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ClassSupplier {

    private final Predicate<Integer> numberIsMoreThan100 = i -> i > 100;

    public void printIfResultIsMoreThan100() {
        Stream.generate(ClassSupplier.returnRandomValue)
                .limit(100)
                .map(number -> (int) Math.pow(number, 3))
                .filter(numberIsMoreThan100)
                .forEach(System.out::println);
    }

    private static final Supplier<Integer> returnRandomValue = () -> {
        Supplier<Integer> randomValue = () -> new Random().nextInt(10);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return randomValue.get();
    };
}