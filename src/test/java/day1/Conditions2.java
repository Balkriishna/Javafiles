package day1;

import java.util.Scanner;


public class Conditions2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Object of scanner classes
        System.out.println("Enter your marks: ");

        int marks =  scanner.nextInt();
        System.out.println("Enter your name: ");
        String name = scanner.next();

        if(marks<35){
            System.out.println(name+ " FAIL");
        }else if(marks>=35 && marks <45){
            System.out.println(name + " Pass class");
        }else if(marks>=45 && marks <65){
            System.out.println(name + " Sec class");
        }else if(marks>=65 && marks <85){
            System.out.println(name + " First class");
        }else if(marks>=85 && marks <=100){
            System.out.println(name + " Top class");
        }else{
            System.out.println(name + " Contact Admin");
        }




    }
}
