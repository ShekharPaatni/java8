package archive.dss.recursion;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 16261;
        int revNumber = revNumber(16261, 0);
        System.out.println("Is number palindrome " + (number == revNumber));
    }

    private static int revNumber(int number, int temp) {
        if (number == 0)
            return temp;
        temp = (temp * 10) + (number % 10);
        return revNumber(number/10, temp);
    }
}
