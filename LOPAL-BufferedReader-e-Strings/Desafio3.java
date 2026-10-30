import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Desafio 3 - Exibir apenas os equipamentos com Linux
public class Desafio3 {
    public static void main(String[] args) {
        String arquivo = "ativos.csv";

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            // Ignora o cabeçalho
            leitor.readLine();

            System.out.println("=== EQUIPAMENTOS LINUX ===");
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0].trim();
                String ip = dados[1].trim();
                String sistema = dados[2].trim();

                if (sistema.contains("Linux")) {
                    System.out.println("Host: " + host);
                    System.out.println("IP: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("-------------------------");
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
