package archive.dss.recursion;

import java.util.Random;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class Factorial {
    public static void main(String[] args) {
        int num = new Random().nextInt(6);
        System.out.println(fact(num));
    }

    private static int fact(int num) {
        if (num <= 1)
            return 1;
        return num * fact(num -1);
    }
}
