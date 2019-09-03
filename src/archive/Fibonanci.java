package archive;

/**
 * @author Chandra Shekhar Paatni on 16/6/19
 */
public class Fibonanci {
    public static void main(String[] args) {
        fib(20);
    }
    public static int fib(int n) {
/*
       int n1 = 0, n2 =0;
        for (int i = 1; i <=  20; i++) {
            if (i == 1 || i == 2) {
                n1 = n2 = 1;
                System.out.println(n2);
            }else {
                int temp = n1;
                n1 = n2;
                n2 += temp;
                System.out.println(n2);
            }

        }*/




        if (n == 1 || n ==2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}
