public class DbLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this .data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail =newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head =newNode; 
    }

    //print
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    //Remove first
    public int removeFirst()
    {
        if(head == null)
        {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1)
        {
            int val = head.data;
            head = tail =null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public static void main(String[] args) {
        
    }
}
