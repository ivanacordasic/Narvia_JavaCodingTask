package week03;

public class Hikmet_Solution {

    public static void main(String[] args) {


        int number = -234591;

        System.out.println(isPrime(number));
        System.out.println(reverseNegative(number));






    }

//1. Numbers -- Prime Number
//Write a method that can check if a number is
//prime or not
//
    public static boolean isPrime(int number){

        for (int i = 2; i < number; i++) {


            if ( number % i == 0){

                return false;
            }


        }

return true;

    }

//2. Numbers -- Reverse negative number
//Write a return method that can reverse
//negative number and return it as int

    public  static int reverseNegative(int number){


        if (number > 0){
            throw new ArithmeticException("The number has to be negative");
        }
        number = Math.abs(number);
        String StringNumber = String.valueOf(number);


        char[] array = StringNumber.toCharArray();
        String Result = "";


        for (int i = array.length-1; i >=0 ; i--) {
            Result += array[i];
        }

        int result = Integer.parseInt(Result) * -1;

        return result;

    }



}

