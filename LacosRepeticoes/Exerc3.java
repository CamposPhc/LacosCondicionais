package LacosCondicionais;
import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int op;
        float salario, novoSalario;

        System.out.print("Digite o nome do colaborador: ");
        nome = leia.nextLine();

        System.out.print("Digite o código do cargo do colaborador (1 a 6): ");
        op = leia.nextInt();

        System.out.print("Digite o salário atual do colaborador: ");
        salario = leia.nextFloat();

        switch (op) {
            case 1:
                novoSalario = salario * 1.1f;
                System.out.println("Nome do Colaborador: " + nome);
                System.out.println("Cargo: Gerente");
                System.out.println("Novo Salário: R$ " + novoSalario);
                break;
            case 2:
                novoSalario = salario * 1.07f;
                System.out.println("Nome do Colaborador: " + nome);
                System.out.println("Cargo: Vendedor");
                System.out.println("Novo Salário: R$ " + novoSalario);
                break;
            case 3:
                novoSalario = salario * 1.09f;
                System.out.println("Nome do Colaborador: " + nome);
                System.out.println("Cargo: Supervisor");
                System.out.println("Novo Salário: R$ " + novoSalario);
                break;
            case 4:
                novoSalario = salario * 1.06f;
                System.out.println("Nome do Colaborador: " + nome);
                System.out.println("Cargo: Motorista");
                System.out.println("Novo Salário: R$ " + novoSalario);
                break;
            case 5:
                novoSalario = salario * 1.05f;
                System.out.println("Nome do Colaborador: " + nome);
                System.out.println("Cargo: Estoquista");
                System.out.println("Novo Salário: R$ " + novoSalario);
                break;
            case 6:
                novoSalario = salario * 1.08f;
                System.out.println("Nome do Colaborador: " + nome);
                System.out.println("Cargo: Técnico de TI");
                System.out.println("Novo Salário: R$ " + novoSalario);
                break;
            default:
                System.out.println("Código de cargo inválido.");
        }
    }
}