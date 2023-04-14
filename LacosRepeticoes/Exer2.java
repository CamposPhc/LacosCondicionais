package LacosCondicionais;
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.print(numero + " é par ");
        } else {
            System.out.print(numero + " é ímpar ");
        }

        if (numero >= 0) {
            System.out.println("e positivo.");
        } else {
            System.out.println("e negativo.");
        }
    }
}