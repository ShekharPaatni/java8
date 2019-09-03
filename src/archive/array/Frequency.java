package archive.array;

/**
 * @author Chandra Shekhar Paatni on 22/6/19
 */
class Frequency{

    public static void main(String[] args) {
        printFrequency(new int[]{2, 3, 2, 3, 5}, 5);
    }
    // Function to count frequencies of elements in the archive.array
    // arr: input archive.array
    // n: size of archive.array
    public static void  printFrequency(int arr[], int n){
        int[] temp = new int[n+1];
        for (int i = 0; i < n; i++) {
            temp[arr[i]] = temp[arr[i]] + 1;
        }

        for (int i = 1; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
