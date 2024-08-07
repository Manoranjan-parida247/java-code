//reverse of an array
//time complexity O(n)
//space complexity O(1)
public class Reverse {

    static void RevArray(int a[])
    {
        int i,j,temp;
        i=0;
        j=a.length-1;
        while(i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        RevArray(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
