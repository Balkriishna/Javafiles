package day1;

public class Operators2 {


    public static void main(String[] args) {
        //  && -- and  || -- or

        int x = 10;
        int y = 20;


        System.out.println(x<y && y>x);
        /*
         true && true = true
         true && false = flase
         false && false = false
         */

        System.out.println(x<y || y>x);
        /*
         true || true = true
         true || false = true
         false || false = false
         */

        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x<=y);
    }
}
