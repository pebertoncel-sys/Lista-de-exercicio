import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorConsumo = Double.NEGATIVE_INFINITY;
        int setorMaiorConsumo = 0;

        for (int i = 0; i < 12; i++) {
            double consumo = scanner.nextDouble();
            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
                setorMaiorConsumo = i + 1;
            }
        }

        System.out.printf("Setor que mais consumiu: %d%n", setorMaiorConsumo);
        System.out.printf("Consumo do setor: %.2f%n", maiorConsumo);
        scanner.close();
    }
}
