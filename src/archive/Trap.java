package archive;

/**
 * @author Chandra Shekhar Paatni on 13/7/19
 */
public class Trap {
    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{8, 8, 2, 4, 5, 5, 1}, 8));
    }

    static int trappingWater(int arr[], int n) {
        int leftMax = 0, rightMax = 0,  low = 0, high = arr.length-1, result = 0 ;
        while (low <= high) {

            if (arr[low] <  arr[high]) {
                if (leftMax < arr[low]) {
                    leftMax = arr[low];
                } else
                    result += leftMax - arr[low];
                low++;

            }else {
                if (rightMax < arr[high]) {
                    rightMax = arr[high];
                }
                else
                    result+= rightMax- arr[high];
                    high--;
            }
        }
        return result;
    }
}
