package day1;

public class Calculator {


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.addNumber(20,30);
        calculator.addNumber(24,340);

    }

    // Accessmodifier returnType methodName (Parmeter,parm){ body }
    public void addNumber(int x, int y){
        int sum = x +y;
        System.out.println("Sum: "+ sum);
    }


}
