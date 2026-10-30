import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Desafio 1 - Exibir apenas os nomes dos hosts
public class Desafio1 {
    public static void main(String[] args) {
        String arquivo = "ativos.csv";

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            // Ignora o cabeçalho
            leitor.readLine();

            System.out.println("=== HOSTS CADASTRADOS ===");
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0].trim();

                System.out.println(host);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
