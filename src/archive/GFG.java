package archive;

/**
 * @author Chandra Shekhar Paatni on 2/7/19
 */
public class GFG {
    public static void main(String[] args) {
        System.out.println(strstr("abcabcabcd", "acd"));
    }

    static int strstr(String str, String target) {
       /* int strLength = str.length();
        int targetLength = target.length();

        if (targetLength > strLength)
            return -1;
        for (int i = 0; i <= strLength - targetLength; i++) {
            if (str.substring(i, i+targetLength).equals(target))
                return i;
        }
        return -1;*/
       return str.indexOf(target);
    }
}
