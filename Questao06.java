import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        if (salario <= 4000.00) {
            System.out.println("Possui direito ao vale-refeição");
        } else {
            System.out.println("Não possui direito ao vale-refeição");
        }
        sc.close();
    }
}
