package week01;

public class Gregory_Solution {

    public static void main(String[] args) {

        identify(2112);
        System.out.println("---------------------------------------");
        divideWithoutOperator(10,3);
        System.out.println("---------------------------------------");
        FINRA(1,30);

    }
/*
1.
Write a method which can identify if a given number is even or odd
EX:
    identify(5) -> "Odd"
    identify(6) -> :Even"
 */
    public static void identify (int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        /*
2.
Numbers -- Divide without / operator
Write a method that can divide two numbers without using the division operator
         */
    }
        public static void divideWithoutOperator (int num1, int num2){
        if (num1 <= 0 || num2 <= 0){
            System.err.println("Number has to be positive and more than 0");
            return;
        }
        int a = num1;
        int b = num2;
        int remainder = a % b;
            int count = 0;
            while (a >= b){
                a -= b;
                count++;
            }
            System.out.println(num1 + " divided by " + num2 + " = " + count + " with " + remainder + " remaining");
        }

/*
3.
FINRA:
Write a method which prints out the numbers from 1 to 30 but for numbers which are multiple of 3 print "FIN" instead
of the number and for number which area multiple of 5, print "RA" instead of the number. For numbers which are
multiple of both 3 and 5, print "FINRA" instead of the number.
 */

    public static void FINRA (int num01, int num02){
for (int i = num01; i <= num02; i++){
    if (i % 3 == 0 && i % 5 == 0){
        System.out.print("FINRA ");
    }else if (i % 3 == 0){
        System.out.print("FIN ");
    }else if (i % 5 == 0){
        System.out.print("RA ");
    }else{
        System.out.print(i + " ");
    }

}
    }
}
