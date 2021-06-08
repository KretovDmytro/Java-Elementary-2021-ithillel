package task04.exercise01;

public class Main {

    public static void main(String[] args) {

        Array ar = new Array(new int[]{-7, -4, -1, 0, 3, 10, 11, -25});
        Sorter sort = new Sorter();

        System.out.print("Start array: ");
        Printer.printInfo(ar.getArray());

        ar.setArray(sort.doQuickSort(ar.getArray()));

        System.out.print("Finish array: ");
        Printer.printInfo(ar.getArray());
    }
}
