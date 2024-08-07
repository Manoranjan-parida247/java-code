//problem name- print sub arrays
//time complexity O(n^3)
//brute force approach

class SubArray {

    public static void printSubArray(int a[])
    {
        int i,j,k,sum;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for(i=0;i<a.length;i++)
        {
            
            for(j=i;j<a.length;j++)
            {
                sum=0;
                for(k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                    sum+=a[k];
                }
                System.out.println();
                System.out.println("sum:"+sum);

                if(maxSum<sum)//calculate max sum
                {
                    maxSum=sum;
                }


                if(minSum>sum)//calculate min sum
                {
                    minSum=sum;
                }
            }
            System.out.println();
            
        }
        System.out.println("Max Sum :"+maxSum);
        System.out.println("MIn sum:"+minSum);
    }
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        printSubArray(a);
    }
}
