package archive;

import java.util.stream.IntStream;

/**
 * @author Chandra Shekhar Paatni on 7/7/19
 */
public class BinarySearchIterativeApproach {
    public static void main(String[] args) {
        int index = searchInSorted(IntStream.rangeClosed(0, 31273).toArray(), 31273, 9838);
        System.out.println(index);
    }
    public static int searchInSorted(int arr[], int n, int x) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == x)
                return 1;
            else if (arr[mid] > x)
                high = mid -1;
            else
                low = mid + 1;
        }
        return  -1;
    }
}
