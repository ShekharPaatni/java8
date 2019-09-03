package archive.dss.iteration;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class Palindrome {
    public static void main(String[] args) {
        String str = "baab";
        String revStr = reverseString(str);
        System.out.println(str.equals(revStr));
    }
    private static String reverseString(String string) {
        String temp = "";
        for (int i = string.length()-1; i >=0; i--) {
            temp += string.charAt(i);
        }
        return temp;
    }
}
