import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] fertilidade = new double[6][6];

        for (int linha = 0; linha < fertilidade.length; linha++) {
            double soma = 0;
            for (int coluna = 0; coluna < fertilidade[linha].length; coluna++) {
                fertilidade[linha][coluna] = scanner.nextDouble();
                soma += fertilidade[linha][coluna];
            }
            System.out.printf("Média da linha %d: %.2f%n", linha + 1, soma / fertilidade[linha].length);
        }
        scanner.close();
    }
}
