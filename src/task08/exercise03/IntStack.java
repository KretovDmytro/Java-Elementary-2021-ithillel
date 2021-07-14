package task08.exercise03;

/**
 * @author Kretov D.V
 * @version Написать реализацию IntStack из лекции, который при переполнении теряет элементы снизу
 */

public class IntStack {

    private Integer[] array = new Integer[5];
    private int top = -1;

    public void push(int i) {
        top++;
        if (top < array.length) {
            array[top] = i;
        } else {
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = i;
            top--;
        }
    }

    public Integer[] getArray() {
        return array;
    }

    public int pop() {
        int value = array[top];
        array[top] = null;
        top--;
        return value;
    }
//  пока не пригодился, але хай буде
//    public int peek() {
//        return array[top];
//    }
}
