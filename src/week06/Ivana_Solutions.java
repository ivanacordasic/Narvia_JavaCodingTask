package week06;

public class Ivana_Solutions {

    public static void main(String[] args) {

// Check if the password is valid
        String password = "ivFaa91923#83";
        System.out.println("passwordValidation(password) = " + passwordValidation(password));

// Find the maximum number in an Array
        int[] arr = {1, 432, 54, 67, 3, 6,54, 44};
        System.out.println(maximumNumber(arr));

// Return the sum of Digits in a String
        String str = "iv12an154a";
        System.out.println(sumOfDigits(str));


    }

    public static boolean passwordValidation(String password) {

        boolean length6NoEmptySpaces = password.length() >= 5 && !password.contains(" ");
        boolean upperCaseLetter = !password.contains(password.toLowerCase());
        boolean lowerCaseLetter = !password.contains(password.toUpperCase());
        boolean hasSpecialChar =false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch)){
                hasSpecialChar = true;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return (length6NoEmptySpaces && upperCaseLetter && lowerCaseLetter && hasSpecialChar && hasDigit);

    }

    public static int maximumNumber(int[] arr){

        int maximumNumber = 0;

        for (int each : arr) {
            if (each > maximumNumber) {
                maximumNumber = each;
            }
        }

        return maximumNumber;

    }


    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(Character.toString(str.charAt(i)));
            }
        }

        return sum;
    }


}