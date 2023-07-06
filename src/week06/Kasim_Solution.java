package week06;

public class Kasim_Solution {
    public static boolean validatePassword(String password) {

        boolean isUpper = false;
        boolean isLower = false;
        boolean isSpecial = false;
        boolean isDigit = false;

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 65 && ch <= 90) {
                isUpper = true;
            } else if (ch >= 97 && ch <= 122) {
                isLower = true;
            } else if (ch >= 48 && ch <= 57) {
                isDigit = true;
            } else {
                isSpecial = true;
            }
        }
        return isDigit && isLower && isSpecial && isUpper;
    }
    //-----------------------------------------------------------------------

    public static int findMaximum(int[] numbers) {

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    //-----------------------------------------------------------------------

    public static int sumOfDigits(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {

                sum += Integer.parseInt("" + ch);
            }
        }
        return sum;

    }


}
