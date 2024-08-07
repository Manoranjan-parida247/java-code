class linear{
    public static void main(String[] args) {
        int arr[]={10,45,24,36,85,41,65};
        int n=arr.length-1;
        int key=36;
        int i;
        for( i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("found");
                break;
            }
        }
        if(i==n)
        {
            System.out.println("Not present");
        }
    }
}
// time complexity O(n)