package week03;


public class Nail_solution {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(reverse(-345));
    }
    public static boolean isPrime(int num){

        if (num<=1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;

    }

    public static int reverse(int num){
        if (num<0){
            num*=-1;
        }
        String str=num+"";
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }

        num=Integer.valueOf(reverse)*-1;
        return num;
    }

}
