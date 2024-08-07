//The next greater element of some element X in an array is the first greater element that is to right of X in the same array
//input : [6,8,0,1,3]
//output :[8,-1,1,3,-1]

import java.util.ArrayList;
import java.util.Stack;

class NextGreater{
    //Bruteforce
    public static ArrayList<Integer> findNextGreaterElement(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            boolean findGreater = false;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    list.add(arr[j]);
                    findGreater = true;
                    break;
                }
            }
            if(!findGreater)
            {
                list.add(-1);
            }
        }
        return list;
    }

    public static void findNextGreaterElement2(int[] arr)
    {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--)
        {
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                ans[i] = -1;
            }else{
                ans[i] = arr[stack.peek()];
            }

            stack.push(i);
        }
        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        //System.out.println(findNextGreaterElement(arr)); //[8, -1, 1, 3, -1]
        //findNextGreaterElement2(arr);
        findNextGreaterElement2(arr);
    }
}