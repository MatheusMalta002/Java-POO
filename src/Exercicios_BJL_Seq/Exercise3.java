package Exercicios_BJL_Seq;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter salary:");
        double salary = input.nextDouble();
        double increase = salary * 0.25;

        double newValue = salary + increase;
        System.out.printf("The new salary is: %.2f%n", newValue);

        input.close();
    }
}
