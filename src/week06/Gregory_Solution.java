package week06;

public class Gregory_Solution {

    public static void main(String[] args) {

        passwordValidation("Aa12.wer");

        int[] arrNum = {10,5,58,99,2};
        System.out.println(maxNumber(arrNum));

        String str = "efwef454wefw61";
        System.out.println(sumOfDigits(str));

    }
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns false
 */

    public static void passwordValidation (String pass){
        boolean passLength = pass.length()>= 6;
        boolean passSpace = (!pass.contains(" "));
        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isSpecialChar = false;


        if (passLength && passSpace) {
            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);

                if (Character.isUpperCase(ch)) {
                    isUpper = true;
                }
                if (Character.isLowerCase(ch)) {
                    isLower = true;
                }
                if (Character.isDigit(ch)) {
                    isDigit = true;
                }
                if (!(Character.isLetter(ch) && Character.isDigit(ch))) {
                    isSpecialChar = true;
                }

            }
            if(isDigit && isLower && isSpecialChar && isUpper){
                System.out.println(pass);
            }
        }


    }
    /*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
    public static int maxNumber (int[] num){

        int maxNumber = num[0];

        for (int each : num) {
            if (each > maxNumber) {
                maxNumber = each;
            }
        }

        return maxNumber;
    }
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                sum+= Integer.parseInt(""+ch);
            }
        }
        return sum;
    }
}
