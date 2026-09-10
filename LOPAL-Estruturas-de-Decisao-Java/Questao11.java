import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double investimento = sc.nextDouble();

        if (investimento <= 10000) {
            System.out.println("Bronze");
        } else if (investimento <= 50000) {
            System.out.println("Prata");
        } else if (investimento <= 100000) {
            System.out.println("Ouro");
        } else {
            System.out.println("Platinum");
        }
        sc.close();
    }
}
