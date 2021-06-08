package task03.exercise03;

public class Aggregate {

    public int[][] fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = i * j;
            }
        }
        return array;
    }

    public int[][] invertValues(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] *= -1;
                }
            }
        }
        return array;
    }
}
