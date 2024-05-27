package package2;

public class Stack {
    private int[] stack;
    private int top;

    public Stack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int element) {
        if (top == stack.length - 1) {
            System.out.println("Error: Stack is full");
            return;
        }
        stack[++top] = element;
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Error: Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation (get the top element without removing it)
    public int peek() {
        if (top == -1) {
            System.out.println("Error: Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }
}
