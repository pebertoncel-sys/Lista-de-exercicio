// Desafio 3 - Gerar apenas hosts críticos
// Cria um segundo CSV contendo apenas os hosts com criticidade Alta.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Desafio3Criticos {

    public static void main(String[] args) {

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("hosts.csv"));

            // Arquivo completo
            BufferedWriter escritor = new BufferedWriter(new FileWriter("inventario_atualizado.csv"));

            // Segundo arquivo: somente hosts críticos
            BufferedWriter escritorCriticos = new BufferedWriter(new FileWriter("hosts_criticos.csv"));

            String linha = leitor.readLine();

            escritor.write(linha + ",criticidade");
            escritor.newLine();

            escritorCriticos.write(linha + ",criticidade");
            escritorCriticos.newLine();

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

                String registro = host + "," + ip + "," + so + "," + criticidade;

                // Todos os hosts vão para o arquivo completo
                escritor.write(registro);
                escritor.newLine();

                // Só os de criticidade Alta vão para o arquivo de críticos
                if (criticidade.equals("Alta")) {
                    escritorCriticos.write(registro);
                    escritorCriticos.newLine();
                }
            }

            leitor.close();
            escritor.close();
            escritorCriticos.close();

            System.out.println("Relatorio gerado com sucesso!");
            System.out.println("Arquivo hosts_criticos.csv gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
