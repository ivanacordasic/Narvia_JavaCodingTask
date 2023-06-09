package week02;

public class Nail_solution {
    public static void main(String[] args) {
        //swapNumbers
        int a=1, b=2;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //dividedBy2_3_5
        int N =100;

        for (int i = 0; i < N; i++) {
            String print="";
            if (i%2==0){
                print+="Codility";
            }
            if (i%3==0) {
                print+="Test";
            }
            if (i%5==0) {
                print+="Coders";
            }
            if (i%2!=0 && i%3!=0 && i%5!=0){
                print+=i;
            }
            System.out.println(print);
        }

        //dividedBy3_5_15
        String dividedBy3="", dividedBy5="", dividedBy15="";
        for (int i = 1; i < 100; i++) {

            if (i%3==0){
                dividedBy3+=i+"; ";
                if (i%5==0){
                    dividedBy15+=i+"; ";
                }
            }
            if (i%5==0){
                dividedBy5+=i+"; ";
            }
        }
        System.out.println(dividedBy3+"\n"+dividedBy5+"\n"+dividedBy15);
    }



}
