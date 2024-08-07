//pairs of array
//time complexity O(n^2)
public class Pairs {

    public static void pairsArray(int a[]) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")" + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        pairsArray(a);

    }
}
