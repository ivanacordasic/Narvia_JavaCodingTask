package week05;

public class Ivana_Solutions {

    public static void main(String[] args) {

// Find the unique characters from a String
        String str = "AAABBBCCCDDEF";
        System.out.println(findUniqueCharacters(str));

// Reverse a String
        String str1 = "Lollipop World";
        System.out.println(reverse(str1));

    }


    public static String findUniqueCharacters(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                }
            }

            if (count==1){
                result += ch;
            }

        }

        return result;

    }

    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }


}
