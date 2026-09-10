import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine().trim();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Pode solicitar auxílio combustível");
        } else {
            System.out.println("Não possui auxílio combustível");
        }
        sc.close();
    }
}
