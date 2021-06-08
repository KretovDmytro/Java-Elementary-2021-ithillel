package task02.exercise01;

/**
 * @author Kretov D.V
 */

public class TaxPercentage extends Tax {

    private final double PROCENT;

    public TaxPercentage(double procent) {
        this.PROCENT = procent;
    }

    // считаем процент от дохода.
    // например, это чёткий налог для всех людей! условимся, что он 25% в не зависимости от суммы дохода.
    // метод вернёт нам сколько забирает налог этими 25%

    @Override
    public double calculate(double income) {
        return income * PROCENT;
    }
}
