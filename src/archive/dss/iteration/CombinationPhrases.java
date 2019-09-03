package archive.dss.iteration;

import archive.CustomArrayList;

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

        printNameCombination(nameList, activityList, gameList);

    }

    public static void printNameCombination(CustomArrayList<String> nameList, CustomArrayList<String> activityList, CustomArrayList<String> gameList) {
        if (nameList.size() == 0 && activityList.size() == 0 && gameList.size() == 0)
            return;

        for (int i = 0; i < nameList.size(); i++) {
            for (int i1 = 0; i1 < activityList.size(); i1++) {
                for (int i2 = 0; i2 < gameList.size(); i2++) {
                    System.out.println(nameList.get(i) +" "+ activityList.get(i1) + " "+ gameList.get(i2));
                }
            }
        }

    }


}
