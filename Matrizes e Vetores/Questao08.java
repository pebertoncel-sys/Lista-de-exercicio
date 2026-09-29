import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorQuantidade = Integer.MIN_VALUE;
        int regiaoLinha = 0;
        int regiaoColuna = 0;

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                int focos = scanner.nextInt();
                if (focos > maiorQuantidade) {
                    maiorQuantidade = focos;
                    regiaoLinha = linha + 1;
                    regiaoColuna = coluna + 1;
                }
            }
        }

        System.out.printf("Região com maior quantidade de focos: linha %d, coluna %d%n", regiaoLinha, regiaoColuna);
        System.out.println("Quantidade de focos: " + maiorQuantidade);
        scanner.close();
    }
}
