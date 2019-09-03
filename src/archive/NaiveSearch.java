package archive;

/**
 * @author Chandra Shekhar Paatni on 1/7/19
 */
public class NaiveSearch {
    public static void main(String[] args) {
       boolean isSearch = search("ahf", "lkjsdfhaiuehaoewiuraoikdehjakdsfhlsjdkihalieushralkehfailuewhfaklfjsdhfliuewahf");
        System.out.println(isSearch);
    }

    public static boolean search (String pattern, String text) {
        int patternLength = pattern.length();
        int textLength = text.length();
        for (int i = 0; i <= textLength - patternLength; i++) {
            for (int i1 = 0; i1 < patternLength; i1++) {
                if (text.charAt(i + i1) != pattern.charAt(i1))
                    break;
                if (i1  ==  patternLength -1)
                    return true;
            }
        }
        return false;
    }
}
