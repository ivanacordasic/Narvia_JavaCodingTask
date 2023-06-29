package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kasim_Solution {

    public static String findUnique(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int counter = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 1) {
                result += "" + str.charAt(i);
            }
        }
        return result.replaceAll(" ","");
    }

    //---------------------------------------------------------------------

    public static String reverse(String str) {

        String result = "";

        if (str.contains(" ")) {


            String[] words = str.split(" ");

            for (int i = words.length - 1; i >= 0; i--) {

                result += words[i] + " ";

            }
            return result.trim();

        } else {

            for (int i = str.length() - 1; i >= 0; i--) {

                result += "" + str.charAt(i);
            }
            return result;
        }
    }

    //---------------------------------------------------------------------

    public static String reverse2(String str) {


        String result = "";

        ArrayList<String> strList = new ArrayList<>();

        if (str.contains(" ")) {

            strList.addAll(Arrays.asList(str.split(" ")));

            Collections.reverse(strList);

            for (String eachWord : strList) {

                result += eachWord + " ";
            }
        } else {

            strList.addAll(Arrays.asList(str.split("")));

            Collections.reverse(strList);

            for (String eachLetter : strList) {

                result += eachLetter;
            }
        }
        return result.trim();
    }

}
