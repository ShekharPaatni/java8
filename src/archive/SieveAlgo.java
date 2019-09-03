package archive;

import java.util.stream.IntStream;

/**
 * @author Chandra Shekhar Paatni on 12/7/19
 */
public class SieveAlgo {
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(0, 100).toArray();
        int length = arr.length;
        int i = 2;
        while ((i * i) <= length) {
            if (arr[i] != 0) {
                for (int i1 = 2; i1 < length; i1++) {
                    if (arr[i] * i1 > length)
                        break;
                    arr[arr[i] * i1] = 0;
                }
            }
            i++;
        }

        for (int i1 = 2; i1 < arr.length; i1++) {
            if (arr[i1] != 0)
                System.out.println(arr[i1]);
        }
    }
}
