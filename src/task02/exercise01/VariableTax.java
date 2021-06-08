package task02.exercise01;

/**
 * @author Kretov D.V
 */

public class VariableTax extends Tax {

    // налог в зависимости от дохода
    // метод вернёт нам сколько забирает налог в зависимости от дохода

    @Override
    public double calculate(double income) {
        if (income >= 1000) {
            return income * 0.20;
        } else {
            return income * 0.10;
        }
    }
}
