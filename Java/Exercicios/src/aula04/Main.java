package aula04;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int resultadoSoma = num1 + num2;
        int resultadoSubtracao = num1 - num2;
        int resultadoMultiplicacao = num1 * num2;
        int resultadoDivisao = num1 / num2;
        int resultadoResto = num1 % num2;

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
        System.out.println("Resto da divisão: " + resultadoResto);
        
        scanner.close();

    }

    
}
