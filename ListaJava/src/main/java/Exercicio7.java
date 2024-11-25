import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = entrada.nextDouble();

        float comissao = (float) (salario * 0.05);
        float salarioLiquido = (float) (salario + comissao);

        System.out.println("O seu salário líquido é: " + salarioLiquido);
    }
}
