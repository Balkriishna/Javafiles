package day1;

public class StringExample6 {


    public static void main(String[] args) {
//                    0 1 2 3 4 5

        String name = " Arvind is from bangalore ";// {'A','r'}

        System.out.println(name.replace(" ",""));

        for(String n : name.trim().split(" ")){
            System.out.print(n);
        }


    }
}
