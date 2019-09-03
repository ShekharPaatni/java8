package archive;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 8/7/19
 */
public class Majority {
    public static void main(String[] args) {
        int maj = majorityElement(new int[]{0,1,1,1,3}, 5);
        System.out.println(maj);
    }
    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);
        int count = 0, lastValue = a[0];
        for (int i = 0; i < a.length; i++) {
            if (lastValue != a[i]) {
                if (count > size / 2)
                    return lastValue;
                lastValue = a[i];
                count = 0;
            }
            count++;

        }
        if (count > size /2)
            return lastValue;

        return -1;
    }
}
