package archive.dss.practice;

import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 9/5/19
 */
public class GFG {

    public static int findMax(Height[] arr, int n) {
        int max = 0;
        if ((n >=1 && n<= Math.pow(10, 5)))
            for (int i = 0; i < n; i++) {
                if (arr[i].feet >= 0 && arr[i].inches < Math.pow(10, 5)) {
                    int temp = arr[i].feet * 12 + arr[i].inches;
                    if (max < temp)
                        max = temp;
                }
            }
        return max;
    }
}

class Height {
    int feet;
    int inches;
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
}

class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Height arr[] = new Height[n];
            for (int i = 0; i < n; i++) {
                int temp = scanner.nextInt();
                int temp2 = scanner.nextInt();
                arr[i] = new Height(temp, temp2);
            }
            int res = GFG.findMax(arr, n);
            System.out.println(res);
        }
    }
}