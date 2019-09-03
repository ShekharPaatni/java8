package archive.dss.recursion;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello I am Shekhar";
        reverseString(str, str.length() -1);
    }
    private static void reverseString(String str, int len) {
        if(len >= 0) {
            System.out.print(str.charAt(len));
            reverseString(str, --len);
        }
    }
}
