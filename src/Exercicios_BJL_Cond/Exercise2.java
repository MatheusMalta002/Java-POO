package Exercicios_BJL_Cond;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers in sequence:");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        String result = (firstNumber > secondNumber && firstNumber > thirdNumber) ? "Condition satisfied" : "Error";
        System.out.println(result);

        input.close();
    }
}
