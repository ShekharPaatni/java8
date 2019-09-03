package archive.arr_practice;

/**
 * @author Chandra Shekhar Paatni on 23/5/19
 */
public class FindDuplicateNumberInArray {
    static int[] arr = {1,2,32,1,1,2,3,2,1,2,3,2,1,2,1,2};

    public static void main(String[] args) {
        sort();
        duplicateElement();

    }

    public static void duplicateElement() {
        int prev = arr[0];
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (prev == arr[i] && !flag) {
                System.out.print(arr[i] + " ");
                flag = true;
            }else if (prev != arr[i]){
                prev = arr[i];
                flag = false;
            }
        }
    }

    public static void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j])
                    swap(i, j);
            }
        }
    }

    private static void swap(int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
