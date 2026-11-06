// Desafio 4 - Adicionar data da auditoria
// Inclui a coluna data_auditoria com a data em que o relatório foi gerado.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Desafio4DataAuditoria {

    public static void main(String[] args) {

        // Data de hoje no formato dd/MM/yyyy
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAuditoria = LocalDate.now().format(formato);

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("hosts.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("desafio4_data_auditoria.csv"));

            String linha = leitor.readLine();

            escritor.write(linha + ",criticidade,data_auditoria");
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

                escritor.write(host + "," + ip + "," + so + "," + criticidade + "," + dataAuditoria);
                escritor.newLine();
            }

            leitor.close();
            escritor.close();

            System.out.println("Relatorio gerado com sucesso em " + dataAuditoria + "!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
