package task06.exercise02;

import java.util.Scanner;

public class Inputter {

    static Scanner scanner = new Scanner(System.in);

    static public String inputString() {
        System.out.printf("Input the string: %n");
        return scanner.nextLine();
    }
}
