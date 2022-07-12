package day2;

import java.util.Calendar;

public class Calculator {

    public static void main(String[] args) {

        add(33,33); // This is a static method no need have class obj
        Calculator cal = new Calculator();
        cal.add(3,3,2);
    }

    // Method over loading

    public static void add(int x, int y){
         int sum = x +y;
         System.out.println("Addition of two num: "+ sum);
    }
    public  void add(int x, int y, int z){
        int sum = x +y +z;
        System.out.println("Addition of two num: "+ sum);
    }
}
