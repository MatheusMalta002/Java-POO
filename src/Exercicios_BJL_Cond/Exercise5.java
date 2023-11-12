package Exercicios_BJL_Cond;
import java.util.Scanner;

// Calculator

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[ Calculator ]\n");

        System.out.println("-> Enter 1 to sum");
        System.out.println("-> Enter 2 to subtract");
        System.out.println("-> Enter 3 to multiply");
        System.out.println("-> Enter 4 to divide");

        int option = input.nextInt();

        System.out.println("Enter the first number: ");
        double firstNumber = input.nextInt();

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextInt();


        switch (option){
            case 1:
                System.out.println("Sum: " + (firstNumber+secondNumber));
                break;

            case 2:
                System.out.println("Subtraction: " + (firstNumber-secondNumber));
                break;

            case 3:
                System.out.println("Multiplication: " + (firstNumber*secondNumber));
                break;

            case 4:
                if (secondNumber != 0) {
                    System.out.println("Division: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Division by zero.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
        input.close();
    }
}
