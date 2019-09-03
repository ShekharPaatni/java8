package archive.recursive;

/**
 * @author Chandra Shekhar Paatni on 19/6/19
 */
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(253));
    }
    static int sumOfDigit(int N) {
        if (N  == 0)
            return 0;
        return N%10 + sumOfDigit(N/10);
    }
}
