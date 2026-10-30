import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Desafio 2 - Contar quantos dispositivos existem no arquivo
public class Desafio2 {
    public static void main(String[] args) {
        String arquivo = "ativos.csv";
        int total = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            // Ignora o cabeçalho
            leitor.readLine();

            while ((linha = leitor.readLine()) != null) {
                total++;
            }

            System.out.println("Total de dispositivos encontrados: " + total);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
