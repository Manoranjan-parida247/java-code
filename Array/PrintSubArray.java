
//printing subArray in array
//printing total number of array
//finfing minimum and maximum subArray sum
//T.C += O(N^3)
public class PrintSubArray {
    public static void subArray(int a[]){
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(a[k] + " ");
                    sum += a[k];
                }
                total++;
                System.out.println();
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
            System.out.println();
        }
        System.out.println("Total number of subarray : " + total);
        System.out.println("Max sum = " + max + " Min sum = " + min);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        subArray(arr);
    }
}
