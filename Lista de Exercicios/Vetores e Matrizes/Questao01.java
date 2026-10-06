public class Questao01 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        int soma = 0;
        for (int valor : vetor) soma += valor;
        System.out.println("Soma dos elementos: " + soma);
    }
}
