package week01;

public class Kasim_Solution {

    public static String identifyEvenOrOdd(int number) {

        return number % 2 == 0 ? "Even" : "Odd";
    }

    //------------------------------------------------------------------------------------------

    public static int divideTwoNumbers(int dividend, int divisor) {

        int dividendAbs = Math.abs(dividend);
        int divisorAbs = Math.abs(divisor);

        if (divisor == 0) {
            throw new KasimDivideBy0Exception();
        }

        int counter = 0;

        while (dividendAbs >= divisorAbs) {
            dividendAbs = dividendAbs - divisorAbs;
            counter++;
        }
        if (dividend < 0 && divisor < 0) {
            return counter;

        } else if (dividend < 0 || divisor < 0) {
            counter = -counter;
            return counter;

        } else {
            return counter;
        }
    }

    public static class KasimDivideBy0Exception extends ArithmeticException {
        public  KasimDivideBy0Exception() {
            System.err.println("===>You can't divide by 0, GEE WHIZ<===");
        }

    }

    //------------------------------------------------------------------------------------------

    public static void FINRA() {

        int i = 0;

        while (i >= 0 && i < 30) {

            i++;

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }

    }
}



