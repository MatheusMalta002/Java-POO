package Exercicios_BJL_Cond;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int integerNumber = input.nextInt();

        if(integerNumber % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        input.close();
    }
}
