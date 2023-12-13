package Exercicios_BJL_Rep;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo: ");
        int number1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro positivo: ");
        int number2 = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = number1+1; i < number2; i++){
            array.add(i);
        }
        System.out.println("Série numérica: "+array);

        scanner.close();
    }
}
