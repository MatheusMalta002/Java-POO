package Exercicios_BJL_Seq;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four numbers in sequence:");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int numberFour = input.nextInt();

        int sum = numberOne + numberTwo + numberThree + numberFour;
        System.out.println("sum result: " + sum);

        input.close();
    }
}
