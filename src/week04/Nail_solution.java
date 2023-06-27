package week04;

import java.util.TreeSet;

public class Nail_solution {

    //String -- Frequency of Characters
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        System.out.println(frequency_of_Characters("AAABBCDD"));
        System.out.println(sameLetters("abcc", "cab"));
        System.out.println(removeDuplicates("AAABBBCCC"));
    }
    public static String frequency_of_Characters(String string){
        String result="";
        char currentChar='0';

        for (int i = 0; i < string.length()-1; i++) {
            currentChar=string.charAt(i);
            if(!result.contains(currentChar+"")){
                result+=currentChar;
                int frequency=0;
                for (int j = 0; j < string.length(); j++) {
                    if(currentChar==string.charAt(j)){
                        frequency++;
                    }
                }
                result+=frequency+"";
            }
        }

        return result;
    }

    //String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static boolean sameLetters(String firstWord, String secondWord){


        TreeSet<Character> firstSet = new TreeSet<>();
        for (int i = 0; i < firstWord.length(); i++) {
            firstSet.add(firstWord.charAt(i));
        }
        TreeSet<Character> secondSet = new TreeSet<>();
        for (int i = 0; i < firstWord.length(); i++) {
            secondSet.add(secondWord.charAt(i));
        }

        if (firstSet.equals(secondSet)){
            return true;
        }else {
            return false;
        }

    }

    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from
    //String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDuplicates(String word){
        String result="";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(word.charAt(i)+"")){
                result+=word.charAt(i);
            }
        }
        return result;
    }

}
