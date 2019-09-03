package archive.dss.ds;

import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 9/5/19
 */
public class SumOfBitDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        if (T >= 1 && T <= 100) {
            int N = scanner.nextInt();
            if (N >= 1 && N <= 10) {
                Integer []integers = new Integer[N];
                for (int i = 0; i < N; i++) {
                    int num = scanner.nextInt();
                    if (num >= 1 && num <=10)
                        integers[i] = num;
                }

                System.out.println(sumOfBitDiff(integers));
            }
        }
    }

    private static int sumOfBitDiff(Integer ...x) {
        
        return 0;
    }
}
