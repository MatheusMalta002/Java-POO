package Exercicios_BJL_Rep;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("\n [ O algoritmo deve exibir todos os números ímpares compreendidos entre A e B (inclusive) ]\n");
        System.out.println("Regras:\n O primeiro valor será chamado de A e o segundo de B \n O valor de A deve ser menor que B\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor inteiro positivo para A: ");
        int A = scanner.nextInt();

        System.out.print("Insira um valor inteiro positivo para B: ");
        int B = scanner.nextInt();

        for (int i = A; i <= B; i++){

           if (i % 2 != 0) {
               System.out.println("É ímpar: " + i);
           }
        }
        scanner.close();
    }
}
