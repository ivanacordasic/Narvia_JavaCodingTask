package week04;

public class Hikmet_Solutions {


    public static void main(String[] args) {

        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));


    }



    public static String frequencyOfCharacters(String str) {

        String result = "";
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }

            if (!result.contains(ch + "")) {
                result += "" + ch + frequency;
            }
        }

        return result;
    }


}
