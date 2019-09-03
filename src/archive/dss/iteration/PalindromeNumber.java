package archive.dss.iteration;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1221;
        int tempNumber = number;
        int reverseNumber = 0;
        while (tempNumber > 0) {
            reverseNumber = (reverseNumber * 10) + (tempNumber % 10);
            tempNumber /= 10;
        }
        System.out.println(number == reverseNumber);
    }
}
