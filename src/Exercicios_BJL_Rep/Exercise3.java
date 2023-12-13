package Exercicios_BJL_Rep;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> array = new ArrayList<>();

        while (true){
            System.out.print("Insira um número inteiro: ");
            double number = scanner.nextDouble();

            if(number == Math.floor(number) && number > 0){
                array.add(number);
            } else if (number == Math.floor(number) && number < 0) {
                continue;
            }else {
                System.out.println("Quantidade de positivos: "+array.toArray().length);
                break;
            }
        }
    }
}
