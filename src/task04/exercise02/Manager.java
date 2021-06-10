package task04.exercise02;

/**
 * @author Kretov D.V
 */

public class Manager extends Employee {

    int[] subordinates;

    public Manager(String name, String surname, Double salary, int oneSubordinate) {
        super(name, surname);
        super.salary = salary;
        fixOneSubordinate(oneSubordinate);
    }

    // я понимаю, что тут перезаписывается переменная subordinates, потому что её дёрнуло
    // уже при первом конструкторе. Но это лучшее, до чего я додумался с массивом.
    // тут бы конечно динамический список, тогда мб было бы легче.
    public Manager(String name, String surname, Double salary, int oneSubordinate, int twoSubordinate) {
        this(name, surname, salary, oneSubordinate);
        fixTwoSubordinate(oneSubordinate, twoSubordinate);
    }

    void fixOneSubordinate(int oneSubordinate) {
        this.subordinates = new int[1];
        subordinates[0] = oneSubordinate;
    }

    void fixTwoSubordinate(int oneSubordinate, int twoSubordinate) {
        this.subordinates = new int[2];
        subordinates[0] = oneSubordinate;
        subordinates[1] = twoSubordinate;
    }

}
