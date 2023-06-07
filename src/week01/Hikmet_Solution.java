package week01;

public class Hikmet_Solution {

    public static void main(String[] args) {


        for(int i = 1; i <= 30 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");

            } else if (i % 5 == 0) {
                System.out.println("RA");

            } else {
                System.out.println(i);
            }


            //-------------------------------------------------------------------------

            System.out.println("What ever it is");

            //-------------------------------------------------------------------------

            int number = 13;

            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }

        }
    }
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }

        // Check for special cases
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }

        // Determine the sign of the result
        boolean negativeResult = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while (dividend >= divisor) {
            // Find the largest power of 2 (shift) that can be subtracted from the dividend
            int shift = 0;
            while ((dividend >> (shift + 1)) >= divisor) {
                shift++;
            }

            // Subtract the shifted divisor from the dividend
            dividend -= divisor << shift;

            // Update the quotient
            quotient |= 1 << shift;
        }

        if (negativeResult) {
            quotient = -quotient;
        }

        return quotient;
    }




}











