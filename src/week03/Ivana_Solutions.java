package week03;

public class Ivana_Solutions {

    public static void main(String[] args) {

// Prime number:

        int num = 13;
        System.out.println(isPrime(num));

//  Reverse negative number

        int negNum = -4671546;
        System.out.println(reverseNegativeNumber(negNum));

    }

    public static boolean isPrime(int number){
        for (int i = 2; i < number/2; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int reverseNegativeNumber(int number){

     if (number > 0){
            throw new ArithmeticException("Number can not be positive");
        }

        number = Math.abs(number);
        String StringNumber = String.valueOf(number);
        char[] array = StringNumber.toCharArray();
        String StringResult = "";

         for (int i = array.length-1; i >=0 ; i--) {
            StringResult += array[i];
        }

        int result = Integer.parseInt(StringResult);

        return -1 * result;



    }



}
