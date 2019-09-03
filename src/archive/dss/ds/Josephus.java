package archive.dss.ds;

import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 9/5/19
 */
public class Josephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n =scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(josephus(n, k));
        }
    }

    public static int josephus(int n, int k) {
        if (n > 0)
           return  (josephus(n-k, k) + k-1) % n+1;
        return 1;
    }
}
