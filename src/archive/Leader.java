package archive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Chandra Shekhar Paatni on 22/7/19
 */
public class Leader {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = leaders(new int[]{16, 17, 4, 3, 5, 2}, 6);
        arrayList.forEach(System.out::println);
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        int lastTempIndex = n-1;
        int[] arr1 = new int[n];
        int count  = 0;
        for (int i = n-1; i > 0; i--) {
            if (arr[i] >= arr[lastTempIndex]) {
                arr1[count] = arr[i];
                lastTempIndex = i;
                count++;
            }
        }
        final int length = count;
        return IntStream.rangeClosed(1, count).map(i -> arr1[ length - i]).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    }
}
