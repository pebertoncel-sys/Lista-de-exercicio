import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoMedio = sc.nextDouble();

        if (saldoMedio > 5000) {
            System.out.println("Cliente tem direito à isenção de tarifa");
        } else {
            System.out.println("Tarifa bancária mantida");
        }
        sc.close();
    }
}
