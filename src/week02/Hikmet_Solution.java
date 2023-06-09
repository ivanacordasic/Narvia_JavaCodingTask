package week02;

public class Hikmet_Solution {


    public static void main(String[] args) {




        int a = 25;
        int b = 9;
        swapNumbes(a ,b);

        System.out.println("=========================================");


        //============================================================

        int number = 55;
        divisible(number);

        System.out.println("=========================================");

        //============================================================


        int n = 99;
        printConsecutiveNumbers(n);




    }



    public static void divisible(int number){

        String divisibleBy3 = "Divisible by 3: ",
                divisibleBy5 = "Divisible by 5: ",
                divisibleBY15 = "Divisible by 15:  ";


        for (int i = 0; i < 100; i++) {

            if (i %3 ==0 && i %5 ==0 && i %15 == 0){

               divisibleBY15 += i + " ,";

        } else if (i %3 == 0 && !(i %15 == 0)) {
                divisibleBy3 +=i + " ,";
                
            } else if (i %5 == 0 && !(i %15 == 0)) {
                divisibleBy5 +=i + " ,";
            }
        }

        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBY15);

    }

    public static void printConsecutiveNumbers(int n){

        if (n <= 0 ){
            System.out.println("Number can not be negative or 0");
        }

        for (int i = 0; i < n; i++) {

            if (i %2 == 0 && i %3 ==0 && i %5 ==0){
                System.out.println("CodilityTestCoders");
            } else if (i %2 == 0 && i %5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i %3 == 0 && i %5 == 0) {
                System.out.println("TestCoders");
            } else if (i %2 == 0) {
                System.out.println("Codility");
            }else if (i %3 == 0) {
                System.out.println("Test");
            }else if (i %5 == 0) {
                System.out.println("Coders");
            }else {
                System.out.println(i);
            }

        }



    }

    public static void swapNumbes(int a , int b){

        a = a + b ;
        b = a - b;
        a = a - b;

        System.out.println("a = " +a );
        System.out.println("b = " +b );


    }








}
