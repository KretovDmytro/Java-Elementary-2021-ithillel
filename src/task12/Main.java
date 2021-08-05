package task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("mr. First", 50.5);
        Employee e2 = new Employee("mr. Second", 6.60);
        Employee e3 = new Employee("mr. Third", 17.7);
        Employee e4 = new Employee("mr. Fourth", 10d);
        Employee e5 = new Employee("mr. Five", 6.60);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e3);
        employeeList.add(e2);
        employeeList.add(e4);
        employeeList.add(e1);

        List<Employee> employeeList2 = new ArrayList<>(employeeList);
        List<Employee> employeeList3 = new ArrayList<>(employeeList);
        employeeList3.add(e5);

        System.out.println(employeeList + " Unsorted");

        Collections.sort(employeeList);
        System.out.println(employeeList + " Sort by id");

        employeeList2.sort(new EmployeeBySalaryComparator());
        System.out.println(employeeList2 + " Sort by salary");

        employeeList3.sort(new EmployeeBySalaryOrNameComparator());
        System.out.println(employeeList3 + " Sort by salary or name");
    }
}
