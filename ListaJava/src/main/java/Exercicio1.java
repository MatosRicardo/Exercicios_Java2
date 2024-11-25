import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = numbers.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = numbers.nextInt();


        System.out.println("A soma do primeiro e segundo número é: " + (num1 + num2));
        System.out.println("A subtração do primeiro e segundo número é: " + (num1 - num2));
        System.out.println("A multiplicação do primeiro e segundo número é: " + (num1 * num2));
        System.out.println("A divisão do primeiro e segundo número é: " + (num1 / num2));
    }

}
