import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] producao = new double[5];
        double total = 0;

        for (int i = 0; i < producao.length; i++) {
            producao[i] = scanner.nextDouble();
            total += producao[i];
            System.out.printf("Talhão %d: %.2f%n", i + 1, producao[i]);
        }

        System.out.printf("Total geral: %.2f%n", total);
        scanner.close();
    }
}
