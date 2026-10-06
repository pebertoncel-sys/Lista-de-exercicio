public class Questao02 {
    public static void main(String[] args) {
        int[] vetor = {12, 45, 8, 90, 23};
        int maior = vetor[0];
        for (int valor : vetor) if (valor > maior) maior = valor;
        System.out.println("Maior elemento: " + maior);
    }
}
