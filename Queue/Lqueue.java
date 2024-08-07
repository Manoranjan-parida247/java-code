public class Lqueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;

        // isEmpty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (head == null)// no element present
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remode
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            int front = head.data;
            System.out.println("the deleted element is :" + front);

            if (head == tail)// single element present
            {
                head = tail = null;
            } else {
                head = head.next;
            }
        }

        // peek
        public void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.println("The peek element is :" + head.data);
        }

        // Print the entire queue
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = head;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.printQueue(); // Should print the entire queue // 1 -> 2 -> 3
        q.peek(); // Should print the front element     //1
        q.dequeue(); // Should remove the front element and print it // delete 1
        q.printQueue(); // Should print the entire queue again //2 -> 3
        q.peek(); // Should print the new front element // 2
        q.dequeue();    //delete 2
        q.printQueue(); // Should print the entire queue again //3
        q.dequeue(); //delete 3
        q.printQueue(); // Should indicate that the queue is empty 
        q.dequeue(); // Should indicate that the queue is empty
    }
}

