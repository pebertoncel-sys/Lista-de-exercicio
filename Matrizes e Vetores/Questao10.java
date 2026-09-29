import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorProducao = Double.NEGATIVE_INFINITY;
        int pomarMaiorProducao = 0;

        for (int pomar = 0; pomar < 4; pomar++) {
            double totalAnual = 0;
            for (int mes = 0; mes < 12; mes++) {
                totalAnual += scanner.nextDouble();
            }
            if (totalAnual > maiorProducao) {
                maiorProducao = totalAnual;
                pomarMaiorProducao = pomar + 1;
            }
        }

        System.out.println("Pomar com maior produção anual: " + pomarMaiorProducao);
        System.out.printf("Produção anual: %.2f%n", maiorProducao);
        scanner.close();
    }
}
