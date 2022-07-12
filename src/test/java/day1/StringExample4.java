package day1;

public class StringExample4 {


    public static void main(String[] args) {
//                    0 1 2 3 4 5

        String name = "Arvind";

        System.out.println(name.equals("ARVIND"));
        System.out.println(name.equalsIgnoreCase("arvind"));

        System.out.println(name == "arvind");

        // == is  OPERATORS
        //.EQUALS is A METHOD FROM SRTING CLASS
        System.out.println(19==20);
        System.out.println(name.equals(23));

        System.out.println(name.endsWith("ind"));
        System.out.println(name.startsWith("Arv"));
        System.out.println(name.contains("ind"));





    }
}
