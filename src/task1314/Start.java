package task1314;

public class Start {

    public static void main(String[] args) {
        // exercise01
        System.out.println("Задание 1");
        try {
            LastSymbol.compareLastSymbols("asdfdfwef", "asdasdasdasdf");
        } catch (IllegalArgumentException ex) {
            System.out.println("last symbols are equals: " + ex.getMessage());
        }

        // exercise02
        System.out.println("\nЗадание 2");
        BlockTry blockTry = new BlockTry();
        blockTry.printArray();
        blockTry.divideAnyTwoArrayValues();

        // exercise03
        System.out.println("\nЗадание 3");
        BlockTry blockTry1 = new BlockTry();
        blockTry1.printArray();
        try {
            blockTry1.divideAnyTwoArrayValues2();
        } catch (DivideByZeroException ex) {
            System.out.println(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Вышли за рамки массива при выборе элемента для делимого или делителя " + ex.getMessage());
        }
    }
}