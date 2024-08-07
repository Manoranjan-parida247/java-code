//Total number of pairs and size of pair in an array
class Tp{
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10};
        System.out.println(arr.length*(arr.length - 1) / 2);
        int tp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                System.out.println("{" + arr[i] + "," + arr[j] +"}");
                tp++;
            }
        }
        System.out.println("Total number of pairs:"+tp);
    }
}