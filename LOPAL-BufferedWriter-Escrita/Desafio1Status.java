// Desafio 1 - Adicionar coluna Status
// Hosts Windows recebem "Online" e hosts Linux recebem "Em Monitoramento".

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Desafio1Status {

    public static void main(String[] args) {

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("hosts.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("desafio1_status.csv"));

            String linha = leitor.readLine();

            // Novo cabeçalho com as colunas criticidade e status
            escritor.write(linha + ",criticidade,status");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                // Criticidade (mesma regra do exercício base)
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

                // Status: Windows -> Online / Linux -> Em Monitoramento
                String status;
                if (so.contains("Windows")) {
                    status = "Online";
                }
                else if (so.contains("Linux") ||
                         so.contains("Ubuntu") ||
                         so.contains("Debian") ||
                         so.contains("Rocky") ||
                         so.contains("Kali")) {
                    status = "Em Monitoramento";
                }
                else {
                    status = "Desconhecido"; // ex.: macOS (o desafio não define)
                }

                escritor.write(host + "," + ip + "," + so + "," + criticidade + "," + status);
                escritor.newLine();
            }

            leitor.close();
            escritor.close();

            System.out.println("Relatorio gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
