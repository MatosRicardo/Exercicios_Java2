import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Os números em ordem ao contrário " + num1 + " e " + num2);
    }
}