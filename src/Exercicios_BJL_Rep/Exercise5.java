package Exercicios_BJL_Rep;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int number  = scanner.nextInt();

        if(number % 2 != 0 && number % 3 != 0){
            System.out.println(number + " é primo.");
        }else {
            System.out.println(number + " não é primo.");
        }
        scanner.close();
    }
}
