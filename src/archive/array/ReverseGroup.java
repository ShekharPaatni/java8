package archive.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Chandra Shekhar Paatni on 20/6/19
 */
public class ReverseGroup {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,7));
        reverseInGroups(integerList, 7, 3 );
        integerList.forEach(System.out::println);
    }
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int endIndex;
        List<Integer> subArrayList;
        for (int i = 0; i < n; i++) {
            endIndex = i+k;
            if (endIndex >= n) {
                endIndex = n;
            }
                subArrayList = mv.subList(i, endIndex);
            i+=(k-1);
            Collections.reverse(subArrayList);
            arrayList.addAll(subArrayList);
        }
        return arrayList;
    }
}
