package archive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandra Shekhar Paatni on 12/7/19
 */
public class PowerSet {
    public static void main(String[] args) {
        List<String> powerSet = new ArrayList<>();
        powerSet("abc", "",0, powerSet);
        powerSet.forEach(System.out::println);
    }

    static void powerSet(String s, String temp, int i, List<String> powerset) {
        if (i == s.length()) {
            powerset.add(temp);
            return;
        }
        temp += s.charAt(i);
        powerSet(s, temp, i+1, powerset);
        temp = temp.substring(0, temp.length()-1);
        powerSet(s, temp, i+1, powerset);

    }
}
