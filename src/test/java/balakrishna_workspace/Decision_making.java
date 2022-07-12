package balakrishna_workspace;

import java.util.Scanner;

public class Decision_making {
    public static void main(String[] args) {

        //Programm_2 Print the Student result based on the grading system?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();

        if (num < 35 || num == 0) {
            System.out.println("Output : " + num + "  you failed");
        } else if (num == 35 || num <= 70) {
            System.out.println("Output : " + num + "  You are pass in third class");
        } else if (num == 70 || num <= 85) {
            System.out.println("Output : " + num + "  You are pass in second class");
        } else if (num == 85 || num <= 100) {
            System.out.println("Output : " + num + "  You are pass in first class");
        } else if (num > 100) {
            System.out.println("Output : " + num + "  invalid marks please check ");
        }
    }
}



