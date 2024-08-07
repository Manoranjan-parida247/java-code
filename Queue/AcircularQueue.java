//Circular queue using array
public class AcircularQueue {
    static class CircularQueue{
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        CircularQueue(int n)
        {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        //isEmpty
        public  boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }


        //isFull
        public  boolean isFull()
        {
            return (rear+1)%size == front;    
        }

        //add
        public void enqueue(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            //adding first element
            if(front == -1)
            {
                front = front +1;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        //remove
        public void dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return;
            }
            int result = arr[front];
            System.out.println("The deleted element is :" + result);
            if(front == rear) //delete last element
            {
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
        }

        //peek
        public void peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.println("The peek element is :"+ arr[front]);
        }
        public void printCircularQueue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.print("Circular queue :");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);

        q.printCircularQueue();

        q.dequeue();
        q.printCircularQueue();

        q.dequeue();
        q.printCircularQueue();

        q.enqueue(12);
        q.printCircularQueue();
        q.peek();
    }
}
