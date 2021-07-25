package task10;

/**
 * @author Kretov D.V
 * @version Взять за основу код дерева с лекции (прикреплен к лекции).
 * Изменить его таким образом, чтобы в левой ноде значение было меньше или равно родителю, а справа - больше или равно родителю.
 * Добавить в Tree конструктор, который принимает значения для корня
 */

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree(17);

        tree.add(-7);
        tree.add(20);
        tree.add(9);
        tree.add(21);
        tree.add(4);
        tree.add(-18);
        tree.add(5);
        tree.add(5);
        tree.add(5);  // проверка на дубль

        tree.print();
    }
}
