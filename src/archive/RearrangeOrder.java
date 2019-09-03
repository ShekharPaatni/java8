package archive;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 15/7/19
 */
public class RearrangeOrder {

    public static void main(String[] args) {
        arrange(new Long[] {4L, 0L, 2L, 1L, 3L}, 5);
    }
    static void arrange (Long arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=(arr[Math.toIntExact(arr[i])] %n) *n;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]/=n;
        }

        Arrays.stream(arr).forEachOrdered(System.out::println);
    }
}
