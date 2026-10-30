import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Desafio Final - Relatório de ativos com contagem por sistema operacional
public class DesafioFinal {
    public static void main(String[] args) {
        String arquivo = "ativos.csv";
        int total = 0;
        int linux = 0;
        int windows = 0;
        int firewall = 0;
        int outros = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            // Ignora o cabeçalho
            leitor.readLine();

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String sistema = dados[2].trim();

                total++;

                if (sistema.contains("Linux")) {
                    linux++;
                } else if (sistema.contains("Windows")) {
                    windows++;
                } else if (sistema.contains("Firewall")) {
                    firewall++;
                } else {
                    outros++;
                }
            }

            System.out.println("=================================");
            System.out.println("       RELATÓRIO DE ATIVOS       ");
            System.out.println("=================================");
            System.out.println("Total de ativos: " + total);
            System.out.println("---------------------------------");
            System.out.println("Linux:    " + linux);
            System.out.println("Windows:  " + windows);
            System.out.println("Firewall: " + firewall);
            System.out.println("Outros:   " + outros);
            System.out.println("=================================");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
