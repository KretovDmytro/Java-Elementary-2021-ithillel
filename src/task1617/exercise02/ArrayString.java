package task1617.exercise02;

public class ArrayString {

    String[] array;

    public ArrayString(String... strings) {
        array = new String[strings.length];
        int i = 0;
        for (String str : strings) {
            array[i] = str;
            i++;
        }
    }
}
