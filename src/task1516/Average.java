package task1516;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Average implements Runnable {

    private int from;
    private int to;
    private int[] array;
    private double average;

    Logger logger = Logger.getLogger(Average.class.getName());

    public Average(int from, int to, int[] array) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    public double getAverage() {
        return average;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public void run() {
        calculateTheArithmeticMean();
    }

    public void calculateTheArithmeticMean() {
        average = Arrays.stream(array, from, to).average().getAsDouble();
        logger.log(Level.INFO, "arithmetic mean equals: " + average);
    }

    public String calculateTheTotalArithmeticMean(double... mean) {
        double value = (Arrays.stream(mean).sum()) / mean.length;
        return String.format("%.6f", value);
    }
}