//compare strings in lexicographical order and find out which is largest

public class Q3 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "mango"};
        String largest = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(largest.compareTo(arr[i]) <  0)
            {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

/*
 Lexicographic comparison is a way of comparing sequences, such as strings, based on the order of their elements. This comparison method is similar to the way words are ordered in a dictionary.

How Lexicographic Comparison Works
Character-by-Character Comparison:

Compare the first character of both strings.
If the characters are different, the string with the smaller character (according to Unicode or ASCII values) is considered smaller.
If the characters are the same, move to the next character and repeat the comparison.
String Length:

If one string is a prefix of another (all characters compared so far are the same), the shorter string is considered smaller.
Example Comparison
Consider the strings "apple" and "apricot":

Compare the first characters: 'a' == 'a'.
Compare the second characters: 'p' == 'p'.
Compare the third characters: 'p' == 'r'.
Since 'p' < 'r', "apple" is lexicographically smaller than "apricot".
Java Example
In Java, you can use the compareTo method of the String class to perform lexicographic comparison:

public class LexicographicComparison {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "apricot";

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println(str1 + " is lexicographically smaller than " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " is lexicographically greater than " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}

Output
apple is lexicographically smaller than apricot

Detailed Comparison Using Unicode Values
Let's compare "banana" and "bandana":

'b' == 'b'
'a' == 'a'
'n' == 'n'
'a' == 'd' (Here, 'a' < 'd')
Therefore, "banana" is lexicographically smaller than "bandana".

Considerations
Lexicographic comparison is case-sensitive by default. For example, 'A' (65 in ASCII) is less than 'a' (97 in ASCII).
You can perform case-insensitive comparison using compareToIgnoreCase.

int result = str1.compareToIgnoreCase(str2);


 */