package aula03;
import java.util.Scanner;
/*Escreva um programa em Java que receba dois números como entrada e exiba o produto deles.
Dados de teste:
Primeiro número: 25
Segundo número: 5
Saída esperada :
25 x 5 = 125 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int produto = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + produto);
    }
}