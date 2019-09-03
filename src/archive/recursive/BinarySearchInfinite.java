package archive.recursive;

import java.util.stream.IntStream;

/**
 * @author Chandra Shekhar Paatni on 7/7/19
 */
public class BinarySearchInfinite {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(0, 1000);
        int[] arr = intStream.toArray();
        int elementSearch = 0;
        int i = 1;
        while (arr[i] < elementSearch)
            i *= 2;
        if (arr[i] == elementSearch){
            System.out.println(i);
        } else {
//            System.out.println(BinarySearchLeftMostIndex.isBinarySearch(arr, i/2, i, elementSearch));
        }
    }
}
