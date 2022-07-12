package day1;

public class StringExample3 {


    public static void main(String[] args) {
//                    0 1 2 3 4 5
        String name = "ArAvInd_13241341";
        //                0       1

        System.out.println(name.replace("A","@"));

        System.out.println(name.split("_")[0]);
        System.out.println(name.split("_")[1]);




    }
}
