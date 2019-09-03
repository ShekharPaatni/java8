package archive;

/**
 * @author Chandra Shekhar Paatni on 8/7/19
 */
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(floorSqrt(5));
    }
    public static long floorSqrt(long x) {
        return (long) Math.floor(Math.sqrt(x));
    }
}
