import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int areasAbaixoDeQuarenta = 0;

        for (int i = 0; i < 8; i++) {
            double umidade = scanner.nextDouble();
            if (umidade < 40) areasAbaixoDeQuarenta++;
        }

        System.out.println("Áreas com umidade inferior a 40%: " + areasAbaixoDeQuarenta);
        scanner.close();
    }
}
