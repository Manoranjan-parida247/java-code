import java.util.*;

public class Practice {
    public static void main(String[] args) {

        // Write a Program to Swap Two Numbers.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number :");
        // int a = sc.nextInt();

        // System.out.println("Enter 2nd number :");
        // int b = sc.nextInt();

        // System.out.println("Before swap :" + a + " and b:" + b);

        // approach --> 1 Arithmetic
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // approach --> 2 Third variable
        // int temp = a;
        // a = b;
        // b = temp;

        // approach --> 3 using xor
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("After swap :" + a + " and b:" + b);

        // REVERSE NUMBER
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number :");
        // int num = sc.nextInt();

        // int revNum = 0;
        // while( num != 0)
        // {
        // int digit = num % 10;
        // revNum = revNum * 10 + digit;
        // num /= 10;
        // }
        // System.out.println("Reverse number :" + revNum);

        // STRING reverse
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string :");
        // String str = sc.nextLine();

        // char[] arr = str.toCharArray();

        // int i = 0;
        // int j = arr.length-1;
        // while(i < j)
        // {
        // char temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // j--;

        // }
        // System.out.println(new String(arr));
        // sc.close();

        // Write a Program for Fibonacci Series
        // Ex- Fibonacci Series till 10 Terms:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of term you want to print in FIB :");
        // int term = sc.nextInt();

        // int a = 0;
        // int b = 1;
        // System.out.print(a + ", " + b + ", ");
        // for(int i = 2; i < term; i++)
        // {
        // int c = a + b;
        // a = b;
        // b = c;
        // System.out.print(c + ", ");
        // }

        // Write a Program to Find Weather the Number is Palindrome or Not
        // Input: 1221
        // Output: 1221 – is a Palindrome

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number :");
        // int num = sc.nextInt();
        // int temp = num;
        // int revNum = 0;
        // while(temp != 0)
        // {
        // int digit = temp % 10;
        // revNum = revNum * 10 + digit;
        // temp /= 10;
        // }
        // if(num == revNum)
        // {
        // System.out.println(num + " is palindrome");
        // }else{
        // System.out.println(num + " is not palindrome");
        // }

        // Write a Program to Find Weather the String is Palindrome or Not.
        // Input: DAD
        // Output: DAD – is a Palindrome

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string :");
        // String str = sc.nextLine();

        // int i = 0;
        // int j =str.length()-1;
        // boolean isPalindrome = true;
        // while(i < j)
        // {
        // if(str.charAt(i) != str.charAt(j) )
        // {
        // isPalindrome = false;
        // break;
        // }
        // i++;
        // j--;
        // }
        // if(isPalindrome)
        // {
        // System.out.println(str + " is palindrome");
        // }else{
        // System.out.println(str + " is not palindrome");
        // }

        // Write a Program to Find Prime Numbers in Given Range.
        // Input: 2 10
        // Output: Prime Numbers bw 2 and 10 are – 2 3 5 7

        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter starting :");
        // int start = sc.nextInt();
        // System.out.print("enter ending : ");
        // int end = sc.nextInt();

        // System.out.print("prime number between " + start + " and " + end + " are ->
        // ");
        // for(int i = start; i <= end; i++)
        // {
        // int count = 1;
        // for(int j = 2; j <= i*i; j++)
        // {
        // if(i % j == 0)
        // {
        // count++;
        // if(count > 2)
        // break;
        // }
        // }
        // if( count == 2)
        // {
        // System.out.print(i + " ");
        // }
        // }

        // Write a Program to find Factorial of a Number.
        // Input: 5
        // Output: 120 5!= 5x4x3x2x1=120

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number :");
        // int num = sc.nextInt();

        // long factorial = 1;
        // while(num != 0)
        // {
        // factorial = factorial * num;
        // num--;
        // }
        // System.out.println("Factorial :" + factorial);

        // Write a Program to Check Number is Armstrong Number.
        // Input: 153
        // Output: yes
        // 153 is an Armstrong Number
        // 1x1x1 + 5x5x5 + 3x3x3 = 153

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("enter number :");
         * int num = sc.nextInt();
         * int temp = num;
         * int countDigit = String.valueOf(num).length();
         * // while(temp != 0)
         * // {
         * // countDigit++;
         * // temp /= 10 ;
         * // }
         * 
         * //temp = num;
         * int x = 0;
         * while( temp != 0)
         * {
         * int digit = temp % 10;
         * x = x + (int)Math.pow(digit, countDigit);
         * temp /= 10;
         * }
         * if(x == num)
         * {
         * System.out.println("Yes");
         * }else{
         * System.out.println("No");
         * }
         */

        // Write a Program to Count Number of digits in a Number.
        // Input: 1234
        // Outpt: No of digits are = 4

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number :");
        // int num = sc.nextInt();
        // System.out.println("Number of digit : "+ String.valueOf(num).length());
        // int digit = 0;
        // while(num != 0)
        // {
        // digit++;
        // num /= 10;
        // }
        // System.out.println("Number of digit " + digit);

        // Write a Program to Count Number of Even and Odd Digits in a Number.
        // Input: 1234
        // Output: Even Numbers:2
        // Odd Numbers: 2

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number :");
        // int num = sc.nextInt();

        // int oddNumber = 0;
        // int evenNumber = 0;

        // while(num != 0)
        // {
        // int digit = num % 10;
        // if(digit % 2 == 0)
        // {
        // evenNumber++;
        // }else{
        // oddNumber++;
        // }
        // num /= 10;
        // }
        // System.out.println("Even numbers :" + evenNumber + "\nOdd numbers :" +
        // oddNumber);

        // Write a Program to Find Number is Even or Odd.
        // Input:2
        // Output: Even Number

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number :");
        // int num = sc.nextInt();
        // if(num % 2 == 0)
        // {
        // System.out.println("Even");
        // }else{
        // System.out.println("Odd");
        // }

        // Write a Program to Find Sum of Digits in a Number.
        // Input: 1234
        // Output: 10

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number :");
        // int num = sc.nextInt();
        // int sum = 0;
        // while(num != 0)
        // {
        // int digit = num % 10;
        // sum += digit;
        // num /= 10;
        // }
        // System.out.println("Total sum :" + sum);

        // Write a Program to Find the Largest Number.
        // Input: a=10 , b=20, c=30
        // Output: Largest Number is 30

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number :");
        // int a = sc.nextInt();
        // System.out.print("Enter second number :");
        // int b = sc.nextInt();
        // System.out.print("Enter third number :");
        // int c = sc.nextInt();

        // if(a > b)
        // {
        // if(a > c)
        // {
        // System.out.println( a + " is greater");
        // }else{
        // System.out.println( c + " is greater");
        // }
        // }else if(b > c)
        // {
        // System.out.println( b + " is greater");
        // }else{
        // System.out.println( c + " is greater");
        // }

        // Write a Program to Generate Random Number and String
        // import java.util.Random;
        // public class RandomNumberExample {
        // public static void main(String[] args) {
        // Random random = new Random();

        // // Generate a random integer
        // int randomInt = random.nextInt(); // any int value
        // System.out.println("Random Integer: " + randomInt);

        // // Generate a random integer within a specific range (0 to 100)
        // int randomIntInRange = random.nextInt(101);
        // System.out.println("Random Integer (0-100): " + randomIntInRange);

        // // Generate a random double between 0.0 and 1.0
        // double randomDouble = random.nextDouble();//Math.random()
        // System.out.println("Random Double: " + randomDouble);
        // }
        // }

        // import java.util.Random;

        // public class RandomStringExample {
        // private static final String CHARACTERS =
        // "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // public static void main(String[] args) {
        // String randomString = generateRandomString(10); // Length of the random
        // string
        // System.out.println("Random String: " + randomString);
        // }

        // public static String generateRandomString(int length) {
        // Random random = new Random();
        // StringBuilder sb = new StringBuilder(length);

        // for (int i = 0; i < length; i++) {
        // int index = random.nextInt(CHARACTERS.length());
        // sb.append(CHARACTERS.charAt(index));
        // }

        // return sb.toString();
        // }
        // }

        // -----------------ARRAY------------------
        // Write a Program to find the Sum of Elements in Array.
        // Input: a[]={1,2,3,4}
        // Ouput:10

        // int[] arr = {1,2,3,4,5};
        // int sum = 0;
        // for(int i = 0; i < arr.length; i++)
        // {
        // sum += arr[i];
        // }
        // System.out.println("Total sum :" + sum);

        // Write a Program to Print Even and Odd Numbers in Array.
        // Input: a[]={1,2,3,4}
        // Output: Even Numbers 2,4
        // Odd NUMBERS 1,2

        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // System.out.print("Even numbers :");
        // for(int i = 0; i < arr.length; i++)
        // {
        // if(arr[i] % 2 == 0)
        // {
        // System.out.print(arr[i] + ", ");
        // }
        // }
        // System.out.println();

        // System.out.print("Odd numbers :");
        // for(int i = 0; i < arr.length; i++)
        // {
        // if(arr[i] % 2 != 0)
        // {
        // System.out.print(arr[i] + ", ");
        // }
        // }

        // Write a Program to Check 2 Arrays are Equal or Not.
        // Input: a[]={1,2,3,4}
        // b[]={1,2,3,4}
        // output: a and b are equal

        // int[] a = { 1, 2, 3, 4 };
        // int[] b = { 1, 2, 3, 4 };
        // if (a.length != b.length) {
        //     System.out.println(" a and b ara not equal");
        //     return;
        // }
        // boolean isEqual = true;
        // for (int i = 0; i < a.length; i++) {
        //     if (a[i] != b[i]) {
        //         isEqual = false;
        //         break;
        //     }
        // }
        // if (isEqual) {
        //     System.out.println(" a and b ara equal");
        // } else {
        //     System.out.println(" a and b ara not equal");
        // }
        // System.out.println(Arrays.equals(a, b));


        // Write a Program to Find Missing Number in Array.
        // Input: a[]={1,2,3,5}
        // Output: Missing number is 4

        
        // int[] a = { 1, 2, 3, 5 };
        // int n = a.length + 1;
        
        // for(int i = 1; i <= n; i++)
        // {
        //     boolean isMissing = true;
        //     for(int j = 0; j < a.length; j++)
        //     {
        //         if(a[j] == i)
        //         {
        //             isMissing = false;
        //             break;
        //         }
        //     }
        //     if(isMissing)
        //     {
        //         System.out.println("Missing number is :" + i);
        //     }
        // }

        // int expectedSum = n * (n + 1) / 2;
        // int actualSum = 0;
        // for(int i = 0; i < a.length;i++)
        // {
        //     actualSum += a[i];
        // }
        // System.out.println("Missing number :" + (expectedSum-actualSum));


        // Write a Program to Find the Max and Min Element in Array.
        // Input: a[]={3,4,5,6}
        // Output: Max is 6
        // Min is 3

        // int[] a = { 1, 2, 3, 5 };
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i = 0; i < a.length; i++)
        // {
        //     max = (int)Math.max(min, a[i]);
        //     min = (int)Math.min(min, a[i]);
        // }
        // System.out.println("Max :" + max + " min :" + min);

        


    }
}
