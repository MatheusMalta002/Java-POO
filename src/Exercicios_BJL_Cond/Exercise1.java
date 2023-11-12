package Exercicios_BJL_Cond;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers in sequence:");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if(firstNumber > secondNumber) {
            System.out.println("The biggest is: " + firstNumber);

        }else if(firstNumber < secondNumber) {
            System.out.println("The biggest is: " + secondNumber);

        }else {
            System.out.println("The numbers are equal");

        }
    }
}
