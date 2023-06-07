package week02;

public class Gregory_Solution {

    public static void main(String[] args) {

        swapNumbers(10,20);
        System.out.println("-----------------------------------");
        divisibleBy3_5_15(100);
        System.out.println("-----------------------------------");
        printConsecutiveNumbers(20);

    }

    public static void swapNumbers(int a, int b){
        // 1. Swap two variables without using a third

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The new values of a is: " + a + ", and b is: " + b);

    }
    public static void divisibleBy3_5_15(int num){

        String divisibleBy15= "",
                divisibleBy3 = "",
                divisibleBy5 = "";

        if (!(num >=0 && num <= 100)){
            System.err.println("Invalid entry");
            return;
        }
        for (int i = 1; i <=100 ; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";
            }
        }
            System.out.println("Divisible by 15 " + divisibleBy15);
            System.out.println("Divisible by 5 " + divisibleBy5);
            System.out.println("Divisible by 3 " + divisibleBy3);


    }
    
    public static void printConsecutiveNumbers ( int n){
        
        if (n < 1){
            throw new ArithmeticException("The number given has to be 1 or more");
        }
        String divideBy2 = "Codility",
                divideBy3 = "Test",
                divideBy5 = "Coders";

        for (int i = 1; i <= n; i++) {
            if(n % 2 == 0 && n % 3 == 0 && n % 5 == 0){
                System.out.println(divideBy2+divideBy3+divideBy5);
            }else if (i % 2 == 0 && i % 3 == 0){
                System.out.println(divideBy2+divideBy3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(divideBy2+divideBy5);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(divideBy3+divideBy5);
            } else if (i % 2 == 0) {
                System.out.println(divideBy2);
            } else if (i % 3 == 0) {
                System.out.println(divideBy3);
            } else if (i % 5 == 0) {
                System.out.println(divideBy5);
            }else {
                System.out.println(i);
            }
        }
        
        
    }

}
