package archive.dss.iteration;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class PossiblePalindromeString {
    public static void main(String[] args) {
        String str = "Nitin";
        System.out.println(isPalindrome(str.toUpperCase(), 0, str.length()-1));
    }

    private static boolean isPalindrome(String string, int start, int length) {
        while (start < length) {
            if (string.charAt(start++) != string.charAt(length--))
                return false;
        }
        return true;
    }
}
