import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[10];
        int diasAcimaDeTrinta = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = scanner.nextDouble();
            if (temperaturas[i] > 30) diasAcimaDeTrinta++;
        }

        System.out.println("Dias com temperatura acima de 30°C: " + diasAcimaDeTrinta);
        scanner.close();
    }
}
