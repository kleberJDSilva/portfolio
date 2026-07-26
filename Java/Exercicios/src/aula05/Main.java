package aula05;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        for(int i = 0; i < 10; i++){
            
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1))); 

        }
        scanner.close();
    }
    
}

