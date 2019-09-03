package archive;

/**
 * @author Chandra Shekhar Paatni on 9/7/19
 */
public class SumNumbers {
    public static void main(String[] args) {
        String s = "1abc23";
        long sum =  findSum(s);
        System.out.println(sum);
    }

    // Function to find the sum of all
    // the numbers in the given archive.string s
    public static long findSum(String s){
        long sum = 0;
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57)  {
                s1 += (s.charAt(i));
            }else {
                if (!s1.isEmpty()) {
                    sum += Long.parseLong(s1);
                }
                s1 = "";
            }
        }
        if (!s1.isEmpty())
            sum += Long.parseLong(s1);
        return sum;
    }
}
