package task05;

public class Main {
    public static void main(String[] args) {

        Printer prFb = new Printer();
        Number nb = new Number(1000);

        prFb.startFibonacciPrinter(nb.getNumber());
    }
}
