import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Desafio 4 - Exibir apenas os IPs dos equipamentos Windows
public class Desafio4 {
    public static void main(String[] args) {
        String arquivo = "ativos.csv";

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            // Ignora o cabeçalho
            leitor.readLine();

            System.out.println("=== IPs DOS EQUIPAMENTOS WINDOWS ===");
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String ip = dados[1].trim();
                String sistema = dados[2].trim();

                if (sistema.contains("Windows")) {
                    System.out.println(ip);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
