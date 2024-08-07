
import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
    }
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}