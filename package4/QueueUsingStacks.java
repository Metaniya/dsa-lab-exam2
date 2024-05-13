package package4;

public class QueueUsingStacks {
    public class QueueUsingStacks {
        private int capacity;
        private Stack stack1;
        private Stack stack2;

        public QueueUsingStacks(int capacity) {
            this.capacity = capacity;
            this.stack1 = new Stack(capacity);
            this.stack2 = new Stack(capacity);
        }

        public void enqueue(int item) {
            if (isFull()) {
                throw new RuntimeException("Queue is full");
            }
            stack1.push(item);
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        public boolean isFull() {
            return stack1.isFull() || stack2.isFull();
        }
    }


    public class Main {
        public static void main(String[] args) {
            QueueUsingStacks queue = new QueueUsingStacks(5);

            // Enqueue several items into the queue
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);

            // Try to enqueue an item when the queue is full
            try {
                queue.enqueue(60);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage()); // Output: Queue is full
            }

            // Dequeue some items from the queue
            System.out.println(queue.dequeue()); // Output: 10
            System.out.println(queue.dequeue()); // Output: 20

            // Perform peek operations
            System.out.println(queue.peek()); // Output: 30
            System.out.println(queue.dequeue()); // Output: 30

            // Try to dequeue an item when the queue is empty
            try {
                System.out.println(queue.dequeue());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage()); // Output: Queue is empty
            }
        }
    }

}
}
