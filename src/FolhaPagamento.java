import java.util.Scanner;

public class FolhaPagamento {

    double calcularSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasNormaisTrabalhadas = scanner.nextInt();
        System.out.println("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtrasTrabalhadas = scanner.nextInt();
        System.out.println("Digite o valor da hora normal: ");
        double valorHoraNormal = scanner.nextDouble();
        System.out.println("Digite o valor da hora extra: ");
        double valorHoraExtra = scanner.nextDouble();

        return (horasExtrasTrabalhadas * valorHoraExtra) +
                (horasNormaisTrabalhadas * valorHoraNormal);

    }
}
