public class Questao10 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 8, 15}
        };
        int valorProcurado = 8;
        boolean encontrado = false;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor == valorProcurado) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }
        System.out.println(encontrado
                ? "O valor 8 foi encontrado na matriz."
                : "O valor 8 não foi encontrado na matriz.");
    }
}
