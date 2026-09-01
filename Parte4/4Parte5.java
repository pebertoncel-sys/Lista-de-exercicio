import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Antes da troca: A = " + a + ", B = " + b);

        double auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Depois da troca: A = " + a + ", B = " + b);
    }
}
