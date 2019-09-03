package archive.dss.recursion;

import archive.CustomArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class CombinationPhrases {
    static String response = "";

    public static void main(String[] args) {
        CustomArrayList<String> nameList = new CustomArrayList<>();
        nameList.add("John");
        nameList.add("Emma");
        nameList.add("Chloe");

        CustomArrayList<String> activityList = new CustomArrayList<>();
        activityList.add("Plays");
        activityList.add("Hates");
        activityList.add("Watches");

        CustomArrayList<String> gameList = new CustomArrayList<>();
        gameList.add("Cricket");
        gameList.add("Soccer");
        gameList.add("Chess");

        List<CustomArrayList<String>> customArrayLists = Arrays.asList(nameList, activityList, gameList);
        combinePhrases(customArrayLists, "", 0);
    }

    public static void combinePhrases(List<CustomArrayList<String>> customArrayLists, String response, int n) {
        if (customArrayLists.size() == n ) {
            System.out.println(response.trim());
            return;
        }

        int m = customArrayLists.get(n).size();

        for (int i = 0; i < m; i++) {
            combinePhrases(customArrayLists, response+" "+customArrayLists.get(n).get(i), n+1);
        }
    }
}
