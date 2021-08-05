package task12;

/**
 * @author Kretov D.V
 * @version Взять за основу класс Employee из ДЗ №4, задача 2
 * 1. Класс Employee должен реализовывать интерфейс Comparable и сортировать сотрудников по id
 * 2. Написать компаратор, который сравнивает сотрудников по зарплате
 * 3. Написать компаратор, который сравнивает сотрудников по зарплате, если она одинаковая - то по имени.
 * Создать список сотрудников (3-4 шт.) и продемонстрировать что сортировка работает правильно,
 * т.е. вызвать Collections.sort(collection) и Collections.sort(collection, comparator)
 */

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private Double salary;
    private static int count = 0;

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        countCalk();
    }

    public void countCalk() {
        count++;
        this.id = count;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id, employee.id);
    }

    @Override
    public String toString() {
        return "id: " + id + " Name: " + name + " $: " + salary;
    }
}
