import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] producao = new double[7];
        double total = 0;
        double maior = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < producao.length; i++) {
            producao[i] = scanner.nextDouble();
            total += producao[i];
            if (producao[i] > maior) maior = producao[i];
        }

        System.out.printf("Produção total: %.2f toneladas%n", total);
        System.out.printf("Média semanal: %.2f toneladas%n", total / producao.length);
        System.out.printf("Maior produção: %.2f toneladas%n", maior);
        scanner.close();
    }
}
