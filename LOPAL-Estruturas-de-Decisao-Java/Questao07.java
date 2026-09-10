import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meses = sc.nextInt();

        if (meses > 3) {
            System.out.println("Adesão ao plano de saúde disponível");
        } else {
            System.out.println("Adesão ao plano de saúde não disponível");
        }
        sc.close();
    }
}
