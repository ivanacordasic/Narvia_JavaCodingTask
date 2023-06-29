package week05;

public class Gregory_Solution {

    public static void main(String[] args) {

        unique("AAABBBCCCDEF");

        Reverse("ABCD");

    }
    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void unique(String Str) {

        Str = Str.toUpperCase();
        String result = "";

        for (int i = 0; i < Str.length(); i++) {
            char ch1 = Str.charAt(i);
            int count = 0;

            for (int j = 0; j < Str.length(); j++) {
                char ch2 = Str.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }

            }
            if (count == 1) {
                result += ch1;
            }
        }
        System.out.println(result);
    }
    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void Reverse (String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

    }

}

