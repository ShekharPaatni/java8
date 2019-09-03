package archive.recursive;

/**
 * @author Chandra Shekhar Paatni on 19/6/19
 */
public class Palindrome {
    public static void main(String[] args) {
        boolean isPali = isPalindrome("12321", 0, 4);
        System.out.println(isPali);
    }

    public static boolean isPalindrome(String str,  int startIndex, int endIndex) {
        if (startIndex == endIndex)
            return true;
        if (str.charAt(startIndex) != str.charAt(endIndex))
            return false;

        return isPalindrome(str, startIndex+1, endIndex-1);
    }
}
