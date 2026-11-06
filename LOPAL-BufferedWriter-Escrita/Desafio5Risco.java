// Desafio 5 - Integração com o NetSentinel
// Cria a coluna risco com valores de 1 a 10 conforme a criticidade.
//   Alta  -> 9
//   Media -> 5
//   Baixa -> 2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Desafio5Risco {

    public static void main(String[] args) {

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("hosts.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("desafio5_netsentinel.csv"));

            String linha = leitor.readLine();

            escritor.write(linha + ",criticidade,risco");
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

                // Risco de 1 a 10 conforme a criticidade
                int risco;
                if (criticidade.equals("Alta")) {
                    risco = 9;
                }
                else if (criticidade.equals("Media")) {
                    risco = 5;
                }
                else {
                    risco = 2;
                }

                escritor.write(host + "," + ip + "," + so + "," + criticidade + "," + risco);
                escritor.newLine();
            }

            leitor.close();
            escritor.close();

            System.out.println("Relatorio NetSentinel gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
