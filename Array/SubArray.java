//SubarraySum max and min
//T.C : O(N^2)

class SubArray{
    public static void sum(int[] a){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        //creating prefix array
        int[] prefix = new int[a.length];

        prefix[0] = a[0];

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + a[i];
        }

        //calculating maximum and minimum subArraySum
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                //i -> start &  j -> end
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i- 1]; //i == 0 ? prefix[j] -> means if sub array start from index 0
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);

            }
        }
        System.out.println("max : " + maxSum + " min :" + minSum);
    }

    public static void sum2(int[] a){
        //T.C : O(N^2)
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            int sum = 0;
            for(int j = i; j < a.length; j++){
                sum += a[j];
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
        }
        System.out.println("max :"+max);
        System.out.println("min :"+min);
    }
    //kadane's algorithm
    public static void sum3(int a[]){
        //T.C : O(N)
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0; i < a.length; i++){
            sum += a[i];
            max = Math.max(max, sum);

            if(sum < 0){
                sum = 0;
            }
        }
        // To consider the sum of the empty subarray
        if(max < 0){
            max = 0;
        }

        System.out.println("max :"+max);
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,6,-1,-3};
        sum3(arr);
    }
}
