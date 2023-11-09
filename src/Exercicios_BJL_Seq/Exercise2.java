package Exercicios_BJL_Seq;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers to calculate the average:");
        float score1 = input.nextFloat();
        float score2 = input.nextFloat();
        float score3 = input.nextFloat();

        float result = (score1 + score2 + score3) / 3;

        System.out.printf("Average result: %.2f%n", result);
    }
}
