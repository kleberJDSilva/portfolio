package aula08;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (i == 0) {
                maior = numero;
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}