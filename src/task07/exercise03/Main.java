package task07.exercise03;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Color %s in HEX: %s %n", Color.RED, Color.RED.getHex());
        System.out.printf("Color %s in HEX: %s %n", Color.WHITE, Color.WHITE.getHex());
        System.out.printf("Color %s in HEX: %s %n", Color.BLACK, Color.BLACK.getHex());

        System.out.printf("Color %s in DEC: %s, %s, %s %n", Color.GREEN, Color.GREEN.getR(), Color.GREEN.getG(), Color.GREEN.getB());
        System.out.printf("Color %s in DEC: %s, %s, %s %n", Color.BLUE, Color.BLUE.getR(), Color.BLUE.getG(), Color.BLUE.getB());

    }
}