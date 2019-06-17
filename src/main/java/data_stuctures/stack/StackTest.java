package data_stuctures.stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.println(value);
        }
    }
}
