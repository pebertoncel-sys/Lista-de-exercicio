import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (valor > 10000) {
            System.out.println("Transação sinalizada para análise");
        } else {
            System.out.println("Transação não suspeita");
        }
        sc.close();
    }
}
