// Exercício base - Dia 30: Escrita de Arquivos em JAVA (BufferedWriter)
// Lê hosts.csv, classifica a criticidade de cada host e grava inventario_atualizado.csv

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AtualizaInventario {

    public static void main(String[] args) {

        try {
            // Abertura do arquivo CSV de entrada
            BufferedReader leitor =
                new BufferedReader(
                    new FileReader("hosts.csv"));

            // Criação do arquivo CSV de saída
            BufferedWriter escritor =
                new BufferedWriter(
                    new FileWriter("inventario_atualizado.csv"));

            // Leitura do cabeçalho
            String linha = leitor.readLine();

            // Escrita do novo cabeçalho
            escritor.write(linha + ",criticidade");
            escritor.newLine();

            // Processamento dos registros
            while ((linha = leitor.readLine()) != null) {

                // Separação dos campos do CSV
                String[] dados = linha.split(",");

                // Extração dos campos
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                // Definição da variável criticidade
                String criticidade;

                // Classificação de criticidade
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

                // Escrita do registro atualizado
                escritor.write(
                    host + "," +
                    ip + "," +
                    so + "," +
                    criticidade
                );
                escritor.newLine();
            }

            // Fechamento dos arquivos
            leitor.close();
            escritor.close();

            // Mensagem de conclusão
            System.out.println("Relatorio gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
