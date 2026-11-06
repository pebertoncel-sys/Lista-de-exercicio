// Desafio 2 - Contador de sistemas operacionais
// Durante o processamento, conta quantos hosts usam Windows, Linux e macOS.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Desafio2Contador {

    public static void main(String[] args) {

        // Contadores
        int totalWindows = 0;
        int totalLinux = 0;
        int totalMac = 0;

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("hosts.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("desafio2_contador.csv"));

            String linha = leitor.readLine();

            escritor.write(linha + ",criticidade");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                String criticidade;
                if (so.contains("Kali")) {
                    criticidade = "Alta";
                }
                else if (so.contains("Ubuntu") ||
                         so.contains("Debian") ||
                         so.contains("Rocky")) {
                    criticidade = "Baixa";
                }
                else {
                    criticidade = "Media";
                }

                // Contagem por sistema operacional
                if (so.contains("Windows")) {
                    totalWindows++;
                }
                else if (so.contains("macOS")) {
                    totalMac++;
                }
                else if (so.contains("Linux") ||
                         so.contains("Ubuntu") ||
                         so.contains("Debian") ||
                         so.contains("Rocky") ||
                         so.contains("Kali")) {
                    totalLinux++;
                }

                escritor.write(host + "," + ip + "," + so + "," + criticidade);
                escritor.newLine();
            }

            leitor.close();
            escritor.close();

            System.out.println("Relatorio gerado com sucesso!");
            System.out.println("Windows: " + totalWindows);
            System.out.println("Linux: " + totalLinux);
            System.out.println("macOS: " + totalMac);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
