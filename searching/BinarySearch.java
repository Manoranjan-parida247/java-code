public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int key = 90;
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == key) {     //comparision
                System.out.println("found at index:" + mid);
                break;
            } else if (arr[mid] < key) {  //right side
                low = mid + 1;
            } else {         //left side
                high = mid - 1;
            }
        }
        if (low > high) {
            System.out.println("Not present");
        }
    }
}

//time complexity O(log n)
