package task02.exercise01;

/**
 * @author Kretov D.V
 */

public class TaxWithoutPercentage extends Tax {

    private final double HIGHIMPOST;
    private final double LOWIMPOST;

    public TaxWithoutPercentage(double highImpost, double lowImpost) {
        this.HIGHIMPOST = highImpost;
        this.LOWIMPOST = lowImpost;
    }

    // налог чёткой суммы
    // я так понял, что мы просто забираем фиксированную сумму от дохода
    // например, каждый обязан платить 8.9 или 0,1(с низким доходом) условных монет

    @Override
    public double calculate(double income) {
        if (income > 1000) {
            return HIGHIMPOST;
        } else {
            return LOWIMPOST;
        }
    }
}
