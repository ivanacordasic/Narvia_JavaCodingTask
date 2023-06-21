package week04;

public class Kasim_Solution {
    public static String frequencyOfCharacter(String str){

        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int counter = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += "" + ch + counter;

        }return result.toUpperCase();
    }

    //---------------------------------------------------------------

    public static boolean sameLetters(String str,String str1){

        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() != str1.length()){

            throw new IllegalArgumentException("String length must be the same");
        }

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str1.length(); j++) {

                if(str.charAt(i) == str1.charAt(j)){
                    str1 = str1.replaceFirst(""+str1.charAt(j),"");
                }
            }
        }return str1.isBlank() ? true : false;

    }

    //---------------------------------------------------------------

    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    result += "" + str.charAt(i);
                    str = str.replaceAll("" + str.charAt(i), "");
                }
            }
        }return result;
    }

}
