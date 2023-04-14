package LacosCondicionais;
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, c, soma;

        System.out.println("Digite o valor de A: ");
        a = leia.nextInt();
        System.out.println("Digite o valor de B: ");
        b = leia.nextInt();
        System.out.println("Digite o valor de C: ");
        c = leia.nextInt();

        soma = (a + b);

        if (soma > c) {
            System.out.println("A soma de A + B é maior que C.");
        } else if (soma < c) {
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B é igual a C.");
        }
    }
}