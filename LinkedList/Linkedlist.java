class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step 1: Create newNode
        // Step 2: newNode.next = head
        // Step 3: head = newNode
        Node newNode = new Node(data);   // Step 1
        size++;
        if (head == null) { // LL is empty
            head = tail = newNode;
            return;
        }
        newNode.next = head;  // Step 2
        head = newNode; // Step 3
    }

    public void addLast(int data) {
        Node newNode = new Node(data);   // Step 1
        size++;
        if (head == null) { // LL is empty
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // Step 2
        tail = newNode;     // Step 3
    }

    public void addMiddle(int index, int data) {
        if (index == 0) { // if you want to add in head
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);   // Step 1
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public int removeFirst()
    {
        if(size == 0) //no element
        {
            System.out.println("LinkeList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) //1 element
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast(){
        if(size == 0) //no element
        {
            System.out.println("LinkeList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) //1 element
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        //prev -> i = size - 2
        Node prev = head;
        for(int i = 0; i < size-2; i++)
        {
            prev = prev.next;
        }
        int val = tail.data; //prev.next.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int removeMiddle(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return Integer.MIN_VALUE; // Return a sentinel value indicating failure
        }
        size--;
        if (index == 0) {
            int val = head.data;
            head = head.next;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        return val;
    }

    //Iterative search
    public int itrSearch(int key) //O(n)
    {
        Node temp = head;
        int i = 0;
        while (temp != null)
        {
            if(temp.data == key)
            {
                return i; //key found
            }
            temp = temp.next;
            i++;
        }
        return -1; //key not found 
    }


    //Recursive search in linkedlist
    public int helper(Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key)
    {
        return helper(head, key);
    }

    // public int recSearch(Node head, int key) {
    //     if (head == null) {
    //         return -1;
    //     }
    //     if (head.data == key) {
    //         return 0;
    //     }
    
    //     int idx = recSearch(head.next, key);
    //     if (idx == -1) {
    //         return -1;
    //     }
    //     return idx + 1;
    // }
    

    //Reverse linkedlist -> iterative approach
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Delete nth node from end -> iterative approach
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }

        if(n == sz)
        {
            head = head.next; //remove first
            return;
        }

        //size-n -> previous node of deleting node
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    //check if a linkedlist is palindrome or not

    //step 1 -> slow fast approach to find middle of linkedList
    //step 2 -> 2nd half reverse
    //step 3 -> checck if first half == 2nd half
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;
        //for even size linkedlist-> fast != null 
        //for odd size linkedlist-> fast.next != null 
        while(fast != null && fast.next != null)
        {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;//slow is my mid node
    }

    public boolean checkPalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        //step 1 -> find mid
        Node midNode = findMid(head);
        //step 2 -> reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;
        //step 3 ->check left half == right half
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle()  //floyd's cycle finding algorithm
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle()
    {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(fast == slow)
            {
                cycle = true;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> 
        prev.next = null;

    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
        

        System.out.println("size :"+size);
    }
}
