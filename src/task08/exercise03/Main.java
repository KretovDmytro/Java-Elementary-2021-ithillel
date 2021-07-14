package task08.exercise03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        stack.push(10);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        stack.push(66);
        stack.push(77);
        stack.push(88);
        stack.push(99);

        System.out.println(Arrays.toString(stack.getArray()));  // for example

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(Arrays.toString(stack.getArray()));  // for example

        stack.push(-7);
        stack.push(-8);
        stack.push(-9);
        stack.push(-10);
        stack.push(-11);
        stack.push(-12);
        stack.push(-13);

        System.out.println(Arrays.toString(stack.getArray()));  // for example
    }
}

