package archive.dss.recursion;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class Palindrome {
    static  String temp = "";
    public static void main(String[] args) {
        String string = "BaaB";
//        String temp = reverseString(archive.string, archive.string.length()-1);
//        System.out.println(archive.string.equals(temp));

        System.out.println(isPalindromeUsingSubString(string));
    }

    private static String reverseString(String string, int len) {
        if (len >= 0) {
             temp = string.charAt(len) + reverseString(string, --len);
        }
        return temp;
    }

    private static Boolean isPalindromeUsingSubString(String string) {
        if (string.length() == 0 || string.length() ==1)
            return true;
        if (string.charAt(0) == string.charAt(string.length()-1))
            return isPalindromeUsingSubString(string.substring(1, string.length()-1));
        return false;
    }
}
