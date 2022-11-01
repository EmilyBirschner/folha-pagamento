import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.println("Nome do Funcionario: ");
        funcionario.nome = scanner.nextLine();
        System.out.println("Quantidade de filhos: ");
        funcionario.quantidadeFilhos = scanner.nextInt();

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(160,10,contratoTrabalho);
        holerite.imprimir();



    }
}