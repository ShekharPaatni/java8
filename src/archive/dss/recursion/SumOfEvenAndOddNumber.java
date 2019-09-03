package archive.dss.recursion;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class SumOfEvenAndOddNumber {
    static int count = 0, evenSum = 0, oddSum = 0;
    public static void main(String[] args) {
        for (int i = 100; i< 1000; i++) {
            count = evenSum = oddSum = 0;
            if (isSumOfEvenAndOddNumberEqual(i))
                System.out.print(i + " < ");
        }
    }

    private static boolean isSumOfEvenAndOddNumberEqual(int num) {
       if (num > 0) {
           if (count++ % 2 == 0)
               evenSum += (num % 10);
           else
               oddSum += num % 10;
           isSumOfEvenAndOddNumberEqual(num / 10);
       }
       return evenSum ==oddSum;
    }
}
