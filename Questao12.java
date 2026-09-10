import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda = sc.nextDouble();
        int score = sc.nextInt();

        if (renda > 8000 && score > 700) {
            System.out.println("Cartão Premium aprovado");
        } else {
            System.out.println("Cartão Premium recusado");
        }
        sc.close();
    }
}
