public class Questao03 {
    public static void main(String[] args) {
        int[] vetor = {4, 7, 8, 11, 16, 20};
        int quantidadePares = 0;
        for (int valor : vetor) if (valor % 2 == 0) quantidadePares++;
        System.out.println("Quantidade de números pares: " + quantidadePares);
    }
}
