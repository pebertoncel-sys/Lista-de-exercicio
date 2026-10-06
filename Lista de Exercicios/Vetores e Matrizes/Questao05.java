public class Questao05 {
    public static void main(String[] args) {
        int[] notas = {8, 7, 9, 10, 6};
        int soma = 0;
        for (int nota : notas) soma += nota;
        double media = (double) soma / notas.length;
        System.out.println("Soma das notas: " + soma);
        System.out.printf("Média das notas: %.2f%n", media);
    }
}
