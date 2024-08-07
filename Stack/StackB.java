//Stack implementation using arrayList

import java.util.ArrayList;
class StackB{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty 
        public  boolean isEmpty()
        {
            return list.size()==0;
        }

        //push
        public  void push(int data)
        {
            list.add(data);
        }

        //pop
        public  int pop()
        {
            if(isEmpty())
            {
                System.out.println("List is empty!");
                return Integer.MIN_VALUE;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public  int peek()
        {
            if(list.size() == 0)
            {
                System.out.println("List is empty!");
                return Integer.MIN_VALUE;
            }
            return list.get(list.size()-1); 
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("is stack empty ? " + s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}