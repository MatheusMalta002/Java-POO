package Exercicios_BJL_Seq;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("calculating the area of the triangle:\n");

        System.out.println("Base value: ");
        int base = input.nextInt();

        System.out.println("Height value: ");
        int height = input.nextInt();

        int areaResult = (base * height) / 2;

        System.out.println("area of the triangle: " + areaResult);

    }
}
