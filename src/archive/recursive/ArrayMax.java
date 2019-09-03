package archive.recursive;

/**
 * @author Chandra Shekhar Paatni on 19/6/19
 */
class ArrayMax{

    public static void main(String[] args) {
        largestAndSecondLargest(6, new int[]{3,2,1,4,5,6, 6});
    }

    // Function to find largest and second largest element in the archive.array
    static void largestAndSecondLargest(int sizeOfArray, int arr[]){

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && max != arr[i]) {
                max2 = max;
                max = arr[i];
            }
        }
        System.out.println(max + " " + max2);
    }
}