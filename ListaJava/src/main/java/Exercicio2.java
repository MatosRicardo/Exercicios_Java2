
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        int raio = entrada.nextInt();

        int pi = 3;

        int area = pi * raio * raio;
        int perimetro = 2 * pi * raio;


        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);

    }
}
