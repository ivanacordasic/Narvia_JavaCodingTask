package week03;

public class Kasim_Solution {

    public static String primeNumber(int a) {

        if (a <= 1) {
            throw new ArithmeticException("Prime numbers cannot be less than or equal to 1");
        }
        for (int i = 2; i <= a / 2; i++) {

            if (a % i == 0) {
                return "Not Prime";
            } else {
                continue;
            }
        }
        return "Prime";
    }
    
    //------------------------------------------------------------------------------------

    public static int reverseNegativeNumber(int num){

        int numsAbs = Math.abs(num);
        int reverse = 0;

        while(numsAbs > 0){

            int remainder = numsAbs % 10;
            reverse = reverse * 10 + remainder;
            numsAbs = numsAbs / 10;

        }return  num < 0 ? reverse * -1 : reverse;

    }

}
