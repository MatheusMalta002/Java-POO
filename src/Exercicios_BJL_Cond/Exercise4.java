package Exercicios_BJL_Cond;
import  java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers in sequence:");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if(firstNumber == secondNumber){
            System.out.format("Multiplication: %d%n", firstNumber*secondNumber);

        }else if (firstNumber > secondNumber) {
            System.out.format("Subtraction: %d%n", firstNumber-secondNumber);

        }else{
            System.out.format("Sum: %d%n", firstNumber+secondNumber);

        }
        input.close();
    }
}
