import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        double novoValor = valor * 0.85;
        System.out.println("O novo valor do produto é: " + novoValor);
    }
}
