package archive.searching;

/**
 * @author Chandra Shekhar Paatni on 21/5/19
 */
public class BinarySearch {
    int[] arr = {12, 23,134, 442, 543};
    public static void main(String[] args) {
        int findElementIndex = new BinarySearch().binarySearchIndex(0, 4,23);
        if (findElementIndex == -1)
            System.out.println("Not found");
        else
            System.out.println("Found element in index number "+ findElementIndex);
    }
    public int binarySearchIndex(int low, int high, int searchElement) {
        if (low <= high) {
            int mid = (low + high-1) / 2;
            if (arr[mid] == searchElement)
                return mid;
            if (arr[mid] > searchElement)
                binarySearchIndex(low, mid - 1, searchElement);
            if (arr[mid] < searchElement)
                binarySearchIndex(mid + 1, high, searchElement);
        }
        return -1;
    }
}
