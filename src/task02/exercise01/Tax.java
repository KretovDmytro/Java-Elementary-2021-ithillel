package task02.exercise01;

/**
 * @author Kretov D.V
 */

public class Tax {

    // представим так. Мы же не знаем как сюда будет попадать доход. Из базы или файла, или сканера.
    double income = 500.66;

    public double calculate(double income) {
        System.out.printf("Есть такой налог: %.2f %n", income); // для проверки
        return income;
    }
}
