import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double parcela = sc.nextDouble();
        double limite = salario * 0.30;

        if (parcela <= limite) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo recusado");
        }
        sc.close();
    }
}
