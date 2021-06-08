package task03.exercise01;

/**
 * @author Kretov D.V
 */

public class JewelsIn {

    private final String JEWELS = "RubY";
    private final String STONES = "tutMogutBytRubinyNoEtoNeTochno";

    public static void main(String[] args) {
        JewelsIn jewelsIn = new JewelsIn();
        int count = jewelsIn.numJewelsInStones(jewelsIn.JEWELS, jewelsIn.STONES);
        jewelsIn.showInfo(count);
    }

    private void showInfo(int count) {
        System.out.printf("Камни \"%s\" присутствуют тут → \"%s\" в количестве %s %n", JEWELS, STONES, count);
    }

    private int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        char[] jewelsArray = convertStringToArray(jewels); // можно и тут конвертировать строку с массив чаров, как лучше сделать?
        char[] stonesArray = convertStringToArray(stones); // но по мне это как отдельное действие и лучше использовать для этого отдельный метод.

        // логика такая, что идёт сравнение по юникоду символа, если я ни в чём не ошибаюсь.
        for (char charOfJewelsArray : jewelsArray) {
            for (char charOfStonesArray : stonesArray) {
                if (charOfJewelsArray == charOfStonesArray) {
                    count += 1;
                }
            }
        }
        return count;
    }

    private char[] convertStringToArray(String str) {
        return str.toCharArray();
    }
}
