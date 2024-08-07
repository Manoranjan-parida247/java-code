//Queue using Araay
class Aqueue {
    static class Queue {
       static int[] arr;
       static int size;
       static  int rear;

        // Constructor to initialize the queue
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Method to add an element to the queue
        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Overflow");
                return;
            }
            arr[++rear] = data;
        }

        // Method to remove an element from the queue
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Underflow!");
                return;
            }
            int front = arr[0];
            System.out.println("The deleted element is: " + front);
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }

        // Method to peek the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[0];
        }

        // Method to print the queue elements
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);

        q.printQueue();

        q.dequeue();
        q.printQueue();

        System.out.println("Front element is: " + q.peek());
    }
}
