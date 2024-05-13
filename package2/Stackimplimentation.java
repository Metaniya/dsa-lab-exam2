package package2;

public class Stackimplimentation {int[] stack = new int[3];
    int top = 0;

    public class Stack {
        private int capacity;
        private int[] stack;
        private int top;

        public Stack(int capacity) {
            this.capacity = capacity;
            this.stack = new int[capacity];
            this.top = -1;
        }

        public void push(int item) {
            if (isFull()) {
                throw new RuntimeException("Stack is full");
            }
            stack[++top] = item;
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return stack[top--];
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }}