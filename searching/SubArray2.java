//problem name- maximum sub array sum
///time complexity = O(n^2)


class SubArray2 {

    public static void maxSubArraySum(int a[])
    {
        int i,j,sum;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[a.length];
        

        prefix[0]=a[0];
        for(i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
        }
        //printing prefix array
        System.out.println("length of prefix array:"+prefix.length);
        for(int x:prefix)
        {
            System.out.print(x+" ");
        }

        for(i=0;i<a.length;i++)
        {
            for(j=i;j<a.length;j++)
            {
                sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                
                if(maxSum<sum)
                {
                    maxSum=sum;
                }

            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        maxSubArraySum(a);
    }
}

