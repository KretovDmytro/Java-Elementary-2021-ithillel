package task12;

import java.util.Comparator;

public class EmployeeBySalaryOrNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
