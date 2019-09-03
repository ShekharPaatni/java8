package archive.recursive;

/**
 * @author Chandra Shekhar Paatni on 7/7/19
 */
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 10};
        boolean isSearch = binarySearch(arr, 0, 5, 6);
        System.out.println(isSearch);
    }

    public static boolean binarySearch(int[] arr, int low, int high, int elementSearch) {

        if (low > high)
            return false;
        int mid = low + ((high -low) / 2);
        return  (arr[mid] == elementSearch) ? true :
                (arr[mid] > elementSearch) ? binarySearch(arr, low, mid-1, elementSearch)
                        : binarySearch(arr, mid+1, high, elementSearch);
    }
}
