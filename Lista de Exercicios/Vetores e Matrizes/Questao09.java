public class Questao09 {
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 5, 8},
            {11, 16, 20},
            {3, 7, 9}
        };
        int quantidadePares = 0;
        for (int[] linha : matriz) for (int valor : linha) if (valor % 2 == 0) quantidadePares++;
        System.out.println("Quantidade de valores pares: " + quantidadePares);
    }
}
