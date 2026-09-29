import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] producao = new double[4][3];
        double[] totalPorCultura = new double[3];

        for (int mes = 0; mes < producao.length; mes++) {
            for (int cultura = 0; cultura < producao[mes].length; cultura++) {
                producao[mes][cultura] = scanner.nextDouble();
                totalPorCultura[cultura] += producao[mes][cultura];
            }
        }

        for (int cultura = 0; cultura < totalPorCultura.length; cultura++) {
            System.out.printf("Cultura %d: %.2f toneladas%n", cultura + 1, totalPorCultura[cultura]);
        }
        scanner.close();
    }
}
