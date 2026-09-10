import java.text.Normalizer;
import java.util.Scanner;

public class Questao09 {
    private static String semAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cargo = semAcentos(sc.nextLine().trim().toLowerCase());

        if (cargo.equals("administrativo") || cargo.equals("lideranca")) {
            System.out.println("Pode participar do programa de idiomas");
        } else {
            System.out.println("Não pode participar do programa de idiomas");
        }
        sc.close();
    }
}
