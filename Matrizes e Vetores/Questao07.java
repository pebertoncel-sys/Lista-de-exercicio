import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] chuva = new double[7][4];
        double[] totalPorArea = new double[4];

        for (int dia = 0; dia < chuva.length; dia++) {
            for (int area = 0; area < chuva[dia].length; area++) {
                chuva[dia][area] = scanner.nextDouble();
                totalPorArea[area] += chuva[dia][area];
            }
        }

        for (int area = 0; area < totalPorArea.length; area++) {
            System.out.printf("Área %d: %.2f mm%n", area + 1, totalPorArea[area]);
        }
        scanner.close();
    }
}
