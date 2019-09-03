package archive.dss.ds.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Chandra Shekhar Paatni on 7/5/19
 */
public class BinarySearch {
    static int value = 0;

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,2,4,5,6,7,23,12,32,43);
        Collections.sort(integerList);
        value = 121;
        System.out.println(searchingIndex(integerList, 0, integerList.size() -1));
    }

    private static int searchingIndex(List<Integer> integers, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (integers.get(mid) == value)
                return mid;
            else if (integers.get(mid) < value)
                return searchingIndex(integers, mid+1, high);
            else
                return searchingIndex(integers, low, mid-1);
        }
        return -1;
    }
}