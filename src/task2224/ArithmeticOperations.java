package task2224;

import java.util.HashMap;
import java.util.function.BiFunction;

public class ArithmeticOperations {

    private final BiFunction<Integer, Integer, Integer> plusFunction = Integer::sum;
    private final BiFunction<Integer, Integer, Integer> minusFunction = (x, y) -> x - y;
    private final BiFunction<Double, Double, Double> divideFunction = (x, y) -> x / y;
    private final BiFunction<Integer, Integer, Integer> multiplyFunction = (x, y) -> x * y;

    private final HashMap<MathOperations, BiFunction> mapArithmeticOperations = new HashMap<>();

    public void createArithmeticOperationsMap() {
        mapArithmeticOperations.put(MathOperations.PLUS, plusFunction);
        mapArithmeticOperations.put(MathOperations.MINUS, minusFunction);
        mapArithmeticOperations.put(MathOperations.DIVIDE, divideFunction);
        mapArithmeticOperations.put(MathOperations.MULTIPLY, multiplyFunction);
    }

    public HashMap<MathOperations, BiFunction> getMapArithmeticOperations() {
        return mapArithmeticOperations;
    }
}