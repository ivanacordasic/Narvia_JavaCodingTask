package week05;

public class David_Solutions {

    public static void main(String[] args) {

        //Unique test
        System.out.println(uniqueFromString("aabbcccccdddef8!!"));

        //Reverse test
        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString("DoodooShaPooPoo"));
        
    }

    public static String uniqueFromString(String str){
        String result = "";

        //aaabbbcccdefff
        for (int i = 0; i <= str.length()-1 ; i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j <= str.length()-1 ; j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result += ch;
            }
        }
        return result;
    }


    public static String reverseString(String str) {
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);

        }


        return result;
    }

}
