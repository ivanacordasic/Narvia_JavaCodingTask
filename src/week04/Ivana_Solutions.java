
package week04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ivana_Solutions {

    public static void main(String[] args) {

// Frequency Of Characters
        System.out.println(frequencyOfCharacters("AAABBCCCDD"));

// Same letters
        System.out.println(sameLetters("abcd", "abdc"));

// Remove Duplicates
        System.out.println(removeDuplicates("AAABBBCCCA"));

    }


    public static String frequencyOfCharacters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (!result.contains(ch + "")) {
                result += "" + ch + count;
            }

        }

        return result;
    }


    public static boolean sameLetters(String str1, String str2) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        return (list2.size() == list1.size() && list1.containsAll(list2) && list2.containsAll(list1));


    }


    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!result.contains(ch+"")){
                result += ch;
            }

        }
        return result;
    }

}
