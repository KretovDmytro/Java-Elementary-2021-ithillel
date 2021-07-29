package task11.exercise02;

import java.util.Scanner;

public class StringScanner {

    static Scanner scanner = new Scanner(System.in);

    static public void inputString() {
        String string = scanner.nextLine();
        if (isThisStringEmpty(string)) {
            DataCenter.fillTheMap();
            DataCenter.toPrintTwoMostFrequentLines();
        } else {
            DataCenter.add(string);
            inputString();
        }
    }

    static private boolean isThisStringEmpty(String string) {
        return string.matches("^\\s*$");
    }

}


