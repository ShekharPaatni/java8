package archive.recursive;

/**
 * @author Chandra Shekhar Paatni on 19/6/19
 */
public class PrintNNumber {
    public static void main(String[] args) {
        print(3);
    }
    public static void print(int N) {
        if (N < 1)
            return;
        print(N-1);
        System.out.print(N);
    }
}
