package week01;

public class Nail_solution {
    public static void identify(int n){
        if (n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void finra(int num){

        for (int i = 0; i < num; i++) {
            int dev3=i%3, dev5=i%5;

            if (dev3==0&&dev5==0){
                System.out.println("FINRA");
            } else if (dev3==0){
                System.out.println("FIN");
            } else if (dev5==0) {
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void division(int dividend, int divisor){
        int result=0;
        if (divisor==0){
            System.err.println("Divisor can't be zero");
        }
        for (int i =divisor ; i <=dividend ; i+=divisor) {
            result++;
        }
        System.out.println(result+" reminder is "+dividend%divisor);
    }
}
