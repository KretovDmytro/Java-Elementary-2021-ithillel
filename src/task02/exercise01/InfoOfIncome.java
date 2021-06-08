package task02.exercise01;

/**
 * @author Kretov D.V
 */

public class InfoOfIncome {

    double profit;

    public void showFinishInfo(double value) {
        System.out.printf("Доход после уплаты всех налогов: %.2f %n", value);
    }

    public void showStartInfo(Double value) {
        System.out.printf("Доход составил: %.2f %n", value);
    }
}
