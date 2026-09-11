import java.text.Normalizer;
import java.util.Scanner;

public class SistemaConsultaBeneficios {

    // Remove acentos para facilitar a comparação de textos digitados pelo usuário.
    private static String semAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    private static boolean respostaSim(String resposta) {
        return semAcentos(resposta.trim()).equalsIgnoreCase("sim")
                || resposta.trim().equalsIgnoreCase("s");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CONSULTA DE BENEFÍCIOS ===");

        System.out.print("Nome do colaborador: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        System.out.print("Salário: R$ ");
        double salario = Double.parseDouble(sc.nextLine().replace(",", "."));

        System.out.print("Tempo de empresa em meses: ");
        int tempoEmpresa = Integer.parseInt(sc.nextLine());

        System.out.print("Quantidade de filhos: ");
        int quantidadeFilhos = Integer.parseInt(sc.nextLine());

        System.out.print("Modalidade de trabalho (presencial/home office): ");
        String modalidade = semAcentos(sc.nextLine().trim());

        System.out.print("Utiliza veículo próprio? (sim/não): ");
        String utilizaVeiculo = sc.nextLine();

        // Regras fictícias definidas com base nos exercícios do material:
        // Vale-alimentação: salário menor ou igual a R$ 4.000.
        // Auxílio-creche: possuir pelo menos um filho.
        // Plano de saúde: mais de 3 meses de empresa.
        // Auxílio home office: trabalhar na modalidade home office.
        // Auxílio combustível: utilizar veículo próprio.
        // PLR: possuir pelo menos 12 meses de empresa.
        // Bolsa de estudos: salário menor ou igual a R$ 4.000 e mais de 3 meses de empresa.
        boolean temValeAlimentacao = salario <= 4000;
        boolean temAuxilioCreche = quantidadeFilhos > 0;
        boolean elegivelPlanoSaude = tempoEmpresa > 3;
        boolean temAuxilioHomeOffice = modalidade.equalsIgnoreCase("home office");
        boolean temAuxilioCombustivel = respostaSim(utilizaVeiculo);
        boolean participaPLR = tempoEmpresa >= 12;
        boolean elegivelBolsaEstudos = salario <= 4000 && tempoEmpresa > 3;

        System.out.println();
        System.out.println("=== RESULTADO DA CONSULTA ===");
        System.out.println("Colaborador: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println();

        if (temValeAlimentacao) {
            System.out.println("Vale-alimentação: Possui direito");
        } else {
            System.out.println("Vale-alimentação: Não possui direito");
        }

        if (temAuxilioCreche) {
            System.out.println("Auxílio-creche: Possui direito");
        } else {
            System.out.println("Auxílio-creche: Não possui direito");
        }

        if (elegivelPlanoSaude) {
            System.out.println("Plano de saúde: Elegível");
        } else {
            System.out.println("Plano de saúde: Não elegível");
        }

        if (temAuxilioHomeOffice) {
            System.out.println("Auxílio home office: Possui direito");
        } else {
            System.out.println("Auxílio home office: Não possui direito");
        }

        if (temAuxilioCombustivel) {
            System.out.println("Auxílio combustível: Possui direito");
        } else {
            System.out.println("Auxílio combustível: Não possui direito");
        }

        if (participaPLR) {
            System.out.println("Participação na PLR: Elegível");
        } else {
            System.out.println("Participação na PLR: Não elegível");
        }

        if (elegivelBolsaEstudos) {
            System.out.println("Bolsa de estudos: Elegível");
        } else {
            System.out.println("Bolsa de estudos: Não elegível");
        }

        sc.close();
    }
}

/*
Exemplo de dados para teste:
Nome: Ana Souza
Idade: 29
Salário: 3500
Tempo de empresa: 18
Quantidade de filhos: 1
Modalidade: home office
Veículo próprio: sim

Resultado esperado:
Vale-alimentação: Possui direito
Auxílio-creche: Possui direito
Plano de saúde: Elegível
Auxílio home office: Possui direito
Auxílio combustível: Possui direito
Participação na PLR: Elegível
Bolsa de estudos: Elegível
*/
