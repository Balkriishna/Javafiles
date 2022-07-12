package balakrishna_workspace;


//Programm_1 Verify any given number is Even or Odd numbers?


import java.util.Scanner;

public class Even_number_odd_number {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Output : " + num + "  is a even number");
        }
        else
        {
            System.out.println("Output : " + num + " is a odd number");
        }
        scanner.close();


    }
}





