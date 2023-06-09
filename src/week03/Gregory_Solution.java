package week03;

public class Gregory_Solution {

    public static void main(String[] args) {

        primeNumber(43);

        System.out.println("-----------------------------------");

        reverseNegativeNumbers(-67);
    }

    public static void primeNumber(int num) {
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

    public static void reverseNegativeNumbers(int nums) {
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */

        if (nums > 0){
            throw new ArithmeticException("The number has to be negative");
        }
        nums = Math.abs(nums);
        String StringNum = String.valueOf(nums);
        char[] array = StringNum.toCharArray();
        String Result = "";

        for (int i = array.length-1; i >=0 ; i--) {
            Result += array[i];
        }

        int result = Integer.parseInt(Result);

        System.out.println(Result);


    }



}

