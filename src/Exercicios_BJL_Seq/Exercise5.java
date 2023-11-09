package Exercicios_BJL_Seq;
import java.util.Scanner;
import java.lang.Math;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base:");
        double base = input.nextInt();

        while (base == 0) {
            System.out.println("enter a value other than 0!");
            base = input.nextDouble();
        };

        System.out.println("Enter exponent:");
        double exponent = input.nextInt();

        while (exponent == 0) {
            System.out.println("enter a value other than 0!");
            exponent = input.nextDouble();
        };
        double result = Math.pow(base, exponent);

        System.out.println("result: " + Math.round(result));
    }
}
