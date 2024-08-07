//write a program to make first letter upper case

public class Q4 {
    public static void main(String[] args) {
        String str = "hello world hello ";
        System.out.println(printUpper(str));
    }
    public static String printUpper(String str){
        StringBuffer sb = new StringBuffer("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i < str.length()-1)//&& i < str.length()-1 -> to handle space in last of the string
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
