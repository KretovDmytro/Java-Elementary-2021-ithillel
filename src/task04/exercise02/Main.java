package task04.exercise02;

/**
 * @author Kretov D.V
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("First", "Employee", 5.5);
        Employee e2 = new Employee("Second", "Employee", 6.6);
        Employee e3 = new Employee("Third", "Employee", 7.7);

        Manager m1 = new Manager("One", "Manager", 8.8, e1.getId());
        Manager m2 = new Manager("Two", "Manager", 9.9, e2.getId(), e3.getId());


        System.out.println("Manager " + m1.name + " directs employee with ID " + Arrays.toString(m1.subordinates));
        System.out.println("Manager " + m2.name + " directs employee with ID " + Arrays.toString(m2.subordinates));
    }
}
