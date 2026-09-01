import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiro = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int segundo = scanner.nextInt();

        int quociente = primeiro / segundo;
        int resto = primeiro % segundo;

        System.out.println("Quociente da divisão inteira: " + quociente);
        System.out.println("Resto da divisão: " + resto);
    }
}
