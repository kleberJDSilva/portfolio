package aula06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior.");
        } else {
            System.out.println("O número " + num2 + " é maior.");
        }
        scanner.close();
    }
    
}
