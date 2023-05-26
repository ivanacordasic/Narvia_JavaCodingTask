package week01;

public class Ivana_Solution {

    public static void main(String[] args) {

        System.out.println(identify(6));

        System.out.println("-------------------------");

        System.out.println(divide(62, 6));

        System.out.println("-------------------------");

        System.out.println(finra(25));


    }

    public static String identify(int number){
        if (number%2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static int divide(int num1, int num2){
        if (num2 == 0){
            System.err.println("You can not divide by 0");
            System.exit(1);
        }

        int sign = 1;
        if (num1 * num2 < 0) {
            sign = -1;
        }

        int result = 0;

        while (num1 >= num2){
            num1 = num1 - num2;
            result ++;
        }

        System.out.println("The remainder is: " + num1);
        return sign * result;

    }

    public static String finra(int number){
        if (number < 1 || number > 30){
            throw new RuntimeException("Numbers can only be from 1 to 30");
        }

        if (number % 15 == 0 ){
            return  "FINRA";
        }else if (number % 5 == 0 ){
            return "RA";
        }else if (number % 3 == 0 ){
            return "FIN";
        }

        return "" +number;
    }



}


