package week02;

public class Kasim_Solution {
    public static String swapNumbers(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        return ("a = " + a) + "\n" + ("b = " + b);

    }
    //-------------------------------------------------------------------

    public static void divisibleBy_3_5_15() {

        int i = 1;

        String divisibleBy15 = "Divisible By 15 ";
        String divisibleBy5 = "Divisible By 5 ";
        String divisibleBy3 = "Divisible By 3 ";

        while (i >= 1 && i <= 100) {

            i++;

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {

                divisibleBy15 += i + " ";

            }
            if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }
            if (i % 3 == 0) {
                divisibleBy3 += i + " ";

            }
        }
        System.out.println(divisibleBy15.trim());
        System.out.println(divisibleBy5.trim());
        System.out.println(divisibleBy3.trim());
    }

    //-------------------------------------------------------------------

    public static void printConsecutiveNumbers(int n) {

        if (n <= 0) {
            throw new ArithmeticException("Number can not be negative or 0");
        }

        String codility = "Codility";
        String test = "Test";
        String coders = "Coders";

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(codility);
            }
            if (i % 3 == 0) {
                System.out.print(test);
            }
            if (i % 5 == 0) {
                System.out.print(coders);
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}

