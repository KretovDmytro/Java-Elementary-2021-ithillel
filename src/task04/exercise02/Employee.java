package task04.exercise02;

public class Employee {

    int id;
    String name;
    String surname;
    Double salary;
    static int count = 0;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, Double salary) {
        this(name, surname);
        this.salary = salary;
        countCalk();
    }

    public void countCalk() {
        count++;
        this.id = count;
    }
}
