import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome do participante " + i + ": ");
            String nome = scanner.nextLine();

            System.out.println("Participante " + nome + " registrado com sucesso!");
            System.out.println();
        }

        System.out.println("Todos os 10 participantes foram registrados.");
        scanner.close();
    }
}
