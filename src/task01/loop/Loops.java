package task01.loop;

/**
 * @author Kretov D.V
 * @version Напечатать числа от 30 до 0 с использованием for И while И do-while (3 цикла).
 * Если число кратно 3, то не выводить его.
 */

public class Loops {

    public static void main(String[] args) {

        Loops loop = new Loops();

        loop.useFor();
        loop.useWhile();
        loop.useDoWhile();
    }

    public void useFor() {
        System.out.printf("Use a \"for\" loop %n");
        for (int i = 30; i >= 0; i--) {
            if (i % 3 != 0 | i == 0) {
                System.out.printf("%s ", i);
            }
        }
    }

    public void useWhile() {
        System.out.printf("\n\nUse a \"while\" loop %n");
        int i = 30;
        while (i >= 0) {
            if (i % 3 != 0 | i == 0)
                System.out.printf("%s ", i);
            i--;
        }
    }

    public void useDoWhile() {
        System.out.printf("\n\nUse a \"do-while\" loop %n");
        int i = 31;
        do {
            i--;
            if (i % 3 != 0 | i == 0) {
                System.out.printf("%s ", i);
            }
        } while (i > 0);
    }
}