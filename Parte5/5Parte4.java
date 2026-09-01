import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capital = scanner.nextDouble();
        System.out.print("Digite a taxa de juros mensal: ");
        double taxa = scanner.nextDouble();
        System.out.print("Digite o tempo em meses: ");
        double tempo = scanner.nextDouble();

        double juros = capital * (taxa / 100) * tempo;
        double montante = capital + juros;

        System.out.println("Os juros são: " + juros);
        System.out.println("O montante final é: " + montante);
    }
}
