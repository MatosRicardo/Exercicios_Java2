import java.util.Scanner;

public class Exercicio11 {

    /*11) Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número interio: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número interio: ");
        int num2 = entrada.nextInt();

        System.out.println("Digite o terceiro número interio: ");
        int num3 = entrada.nextInt();

        int media = (num1 + num2 + num3) / 3;

        System.out.println("A média aritmética dos 3 números é: " + media);
    }
}
