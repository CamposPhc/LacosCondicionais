package LacosCondicionais;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
    	int codigo, quantidade;
    	double valorTotal = 0;
    	String nomeProduto = "";
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o código do produto (de 1 a 6): ");
        codigo = leia.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        quantidade = leia.nextInt();
        

        switch (codigo) {
            case 1:
                nomeProduto = "Cachorro Quente";
                valorTotal = 10.0 * quantidade;
                break;
            case 2:
                nomeProduto = "X-Salada";
                valorTotal = 15.0 * quantidade;
                break;
            case 3:
                nomeProduto = "X-Bacon";
                valorTotal = 18.0 * quantidade;
                break;
            case 4:
                nomeProduto = "Bauru";
                valorTotal = 12.0 * quantidade;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                valorTotal = 8.0 * quantidade;
                break;
            case 6:
                nomeProduto = "Suco de laranja";
                valorTotal = 13.0 * quantidade;
                break;
            default:
                System.out.println("Código inválido!");
                
        }

        System.out.println("Produto comprado: " + nomeProduto);
        System.out.println("Valor total da compra: R$ " + valorTotal);

    }
}






