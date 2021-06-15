package task06.exercise02;

public class MethodList {

    String inputSting;
    int lineLength;
    String outputString;

    public MethodList(String inputSting) {
        this.inputSting = inputSting;
        this.lineLength = inputSting.length();
    }

    public String returnTheMiddleCharacter(String str) {

        if (lineLength % 2 != 0) {
            outputString = str.substring((lineLength / 2), (lineLength / 2) + 1);
            System.out.print("the middle symbol is: ");
        } else {
            outputString = str.substring(((lineLength / 2) - 1), ((lineLength / 2) + 1));
            System.out.print("characters to the left and right of center is: ");
        }
        return outputString;
    }

    public String swapHalvesOfTheLine(String str) {

        if (lineLength % 2 == 0) {
            String str1 = str.substring(0, (lineLength / 2));
            String str2 = str.substring(lineLength / 2);
            outputString = str2.concat(str1);
            System.out.print("swapped parts of the string: ");
        } else {
            String str1 = str.substring(0, lineLength / 2);
            String str2 = str.substring(lineLength / 2 + 1);
            outputString = str2.concat(str.substring((lineLength / 2), (lineLength / 2) + 1)).concat(str1);
            System.out.print("swapped parts of the string, left the middle character: ");
        }
        return outputString;
    }

}
