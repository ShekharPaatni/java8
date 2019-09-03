package archive;

/**
 * @author Chandra Shekhar Paatni on 9/7/19
 */
public class FloorSearch {
    public static void main(String[] args) {

    }
    static int findFloor (int arr[], int left, int right, long x) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            if ((arr[mid] == x) || (arr[mid - 1] < x && arr[mid + 1] > x))
                return arr[mid];
            if (arr[mid] > x)
                return findFloor(arr, left, mid-1, x);
            else
                return findFloor(arr, mid+1, right, x);
        }
        return -1;
    }

}
