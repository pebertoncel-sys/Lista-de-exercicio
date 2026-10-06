public class Questao06 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int soma = 0;
        for (int[] linha : matriz) for (int valor : linha) soma += valor;
        System.out.println("Soma dos elementos da matriz: " + soma);
    }
}
