package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gregory_Solution {

    public static void main(String[] args) {

        FrequencyOfChars("AAABBCDD");

        same("abc", "acb");

        removeDup("AAABBBCCCDDD");

    }

    /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
    public static void FrequencyOfChars(String sentence) {

        sentence = sentence.toUpperCase();
        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch1 = sentence.charAt(i);
            int count = 0;

            if (result.contains("" + ch1)) {
                continue;
            }

            for (int j = 0; j < sentence.length(); j++) {
                char ch2 = sentence.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }

                result = "" + ch1 + count;
            }
            System.out.print(result);

        }
        System.out.println();
    }

    /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */
    public static void same(String str1, String str2) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        Collections.sort(list1);
        Collections.sort(list2);


        if (list1.equals(list2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void removeDup(String sent) {

        String result = "";

        for (int i = 0; i < sent.length(); i++) {
            char ch1 = sent.charAt(i);

            if (result.contains(""+ch1)) {
                continue;
            }
                result += ch1;
            }
            System.out.println(result);


    }

}
