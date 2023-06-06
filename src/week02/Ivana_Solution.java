package week02;

public class Ivana_Solution {

    public static void main(String[] args) {

// Swap two variable's values without using a third variable

        int a = 5;
        int b = 10;

        swap(a, b);


        System.out.println("----------------------------------------------------------");
// Divisible by 3, 5, 15

       int number = 100;
       divisible(number);


        System.out.println("----------------------------------------------------------");
// Print consecutive numbers

        int n = 24;

        codilityTestCoders(n);

    }

    public static void swap(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void divisible(int number){
        String divisibleBy15 = "Divisible By 15: ";
        String divisibleBy5 = "Divisible By 5: ";
        String divisibleBy3 = "Divisible By 3: ";

        for (int i = 1; i <= 100; i++) {
            if (i%15==0){
                divisibleBy15 += i + " ";
            }else if(i%5==0){
                divisibleBy5 += i + " ";
            }else if(i%3==0){
                divisibleBy3 += i + " ";
            }
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }

    public static void codilityTestCoders(int number){
        if (number < 0){
            throw new ArithmeticException("The number can not be negative");
        }

        for (int i = 1; i <= number; i++) {
            boolean by2 = i%2==0;
            boolean by3 = i%3==0;
            boolean by5 = i%5==0;
            if (by2 && by3 && by5){
                System.out.println("CodilityTestCoders");
            }else if(by2 && by3){
                System.out.println("CodilityTest");
            }else if(by3 && by5){
                System.out.println("TestCoders");
            }else if(by2 && by5){
                System.out.println("CodilityCoders");
            }else if(by5){
                System.out.println("Coders");
            }else if(by3){
                System.out.println("Test");
            }else if(by2){
                System.out.println("Codility");
            }else{
                System.out.println(i);
            }
        }

    }

}
