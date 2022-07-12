package day2;

public class Loops2 {

    public static void main(String[] args) {
        //                       0       1      2       3
        String [] stdNames = {"Arvind","Raj","Nikita","Raghu"};

        System.out.println("***** for each ********");
       for(int i=0;i<stdNames.length;i++){
           System.out.println(stdNames[i]);
       }

       System.out.println("***** for each loop ********");

       for(String ref : stdNames){
           System.out.println(ref);
       }

    }
}
