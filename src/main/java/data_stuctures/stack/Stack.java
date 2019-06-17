package data_stuctures.stack;

public class Stack {

    private int size;
    private long elements[];
    private int top;

    public Stack(int size) {
        this.size = size;
        this.elements = new long[size];
        this.top = -1;
    }

    public void push(long element) {
        if (isFull()) {
            System.out.println(" Stack is full : ");
        } else {
            elements[++top] = element;
        }

    }

    public long pop() {
        if (isEmpty()) {
            System.out.println(" Stack is empty ");
            return -1;
        } else {
            int old_top = top;
            top--;
            return elements[old_top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public long peek() {
        return elements[top];
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}
