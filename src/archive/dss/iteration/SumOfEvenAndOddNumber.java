package archive.dss.iteration;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class SumOfEvenAndOddNumber {
    public static void main(String[] args) {
        for (int i =10000; i<100000; i++) {
            if (isIndexSumOfOddAndEvenEquals(i))
                System.out.print(i +" < ");
        }
    }

    private static Boolean isIndexSumOfOddAndEvenEquals(int num) {
        int count =0;
        int even = 0;
        int odd = 0;
        while (num > 0) {
            if (count %2 == 0)
                even += num%10;
            else
                odd += num%10;
            count ++;
            num /= 10;
        }
        return even == odd;
    }
}
