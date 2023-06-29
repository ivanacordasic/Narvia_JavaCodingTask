package week05;

public class Hikmet_Solutions {


    public static void main(String[] args) {

        String str = "kdjnnnngfdddff";

        System.out.println(isUniq(str));
        System.out.println(reverseString(str));




    }


//String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String isUniq(String str){


        String uniqs = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

           int count = 0;

            for (int j = 0; j <= str.length()-1 ; j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }if (count == 1){

                uniqs += ch;
            }
        }
        return uniqs;
    }



    public static String reverseString(String str){


        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);

        }

        return result;

    }



//
//String -- Reverse
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA


}
