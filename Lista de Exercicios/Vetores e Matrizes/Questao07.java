public class Questao07 {
    public static void main(String[] args) {
        int[][] matriz = {
            {12, 5, 8},
            {3, 25, 7},
            {10, 4, 18}
        };
        int maior = matriz[0][0];
        for (int[] linha : matriz) for (int valor : linha) if (valor > maior) maior = valor;
        System.out.println("Maior valor da matriz: " + maior);
    }
}
