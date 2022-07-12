package balakrishna_workspace;

import java.util.Scanner;

public class day_name_printing
{
    public static void main(String[] args)
    {
        //Programm_3 Print the statement based on the day name ?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a the day name : ");
        String dayName = scanner.next();
        if (dayName.equals("monday") ||
                dayName.equals("tuesday") ||
                dayName.equals("wednesday") ||
                dayName.equals("thursday") ||
                dayName.equals("friday"))
                System.out.println("Uff, it's the weekday");
        else if (dayName.equals("saturday") ||
                dayName.equals("sunday"))
                System.out.println("Yayy, it's the weekend");

        scanner.close();
    }


}
