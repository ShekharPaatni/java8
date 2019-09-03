package archive.dss.iteration;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello I am Shekhar";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
