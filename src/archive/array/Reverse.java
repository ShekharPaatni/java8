package archive.array;

/**
 * @author Chandra Shekhar Paatni on 19/6/19
 */
class Reverse
{
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6};
        arrayReversal(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // This function should reverse contents of
    // arr[0..sizeOfArray-1]
    public static void arrayReversal(int arr[],int sizeOfArray)
    {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                int temp = arr[i];
                arr[i] = arr[sizeOfArray - (i + 1)];
                arr[sizeOfArray - (i + 1)] = temp;
            }
        }
    }
}
