package archive;

/**
 * @author Chandra Shekhar Paatni on 16/6/19
 */

class Insert
{
    // You need to insert the given element at the given index.
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the archive.array already has sizeOfArray - 1
    // elements.\

    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3,4 ,5, 0 };
        new Insert().insertAtIndex(arr, 6, 2, 90);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                if (index != sizeOfArray -1)
                    shiftElement(arr, i, sizeOfArray);
                arr[i] = element;

            }
        }
    }

    public void shiftElement(int[] arr, int index, int sizeOfArray) {
        for (int i = sizeOfArray-2; i >= index; i--) {
            arr[i+1] = arr[i];
        }
    }
}
