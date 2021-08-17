package task1516;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Average implements Runnable {

    private int from;
    private int to;
    private int[] array;
    private double average;

    public Average(int from, int to, int[] array) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }



    public int[] getArray() {
        return array;
    }

    @Override
    public void run() {
        calculateTheArithmeticMean();
//        calculateTheArithmeticMean2(from, to, array);
    }

    public void calculateTheArithmeticMean() {
        average = Arrays.stream(array, from, to).average().getAsDouble();
        System.out.println(average);
    }

    public void calculateTheArithmeticMean2(int from, int to, int[] array) {
        long sum = 0;
        int count = 0;
        for (int i = from; i < to; i++) {
            sum += array[i];
            count++;
        }
        double result = sum / count;
        System.out.println(result);
    }


}

//
