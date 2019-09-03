package archive;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chandra Shekhar Paatni on 1/7/19
 */
public class Anagram {
    public static void main(String[] args) {
        boolean isAnagram = isAnagram("geeksforgeeks", "forgeeksgeeks");
        System.out.println(isAnagram);
    }

    public static boolean isAnagram(String s1,String s2)
    {
        return s1.chars().mapToObj(c -> (char)c).sorted().collect(Collectors.toList())
                .equals(s2.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList()));
    }
}
