# Escrita de Arquivos em Java com BufferedWriter

Soluções dos desafios do material **UC - LOPAL JAVA: Escrita BufferWritter** (Dia 30 — Escrita de Arquivos em Java). Todos os programas leem o arquivo `hosts.csv` linha a linha com `BufferedReader`, separam os campos com `split(",")`, classificam a criticidade de cada host pelo sistema operacional e gravam um novo CSV com `BufferedWriter`.

Regra de criticidade (do material): Kali = **Alta**; Ubuntu, Debian ou Rocky = **Baixa**; demais = **Media**.

## Arquivos

| Arquivo | O que faz | Arquivo gerado |
|---|---|---|
| `AtualizaInventario.java` | Algoritmo completo da aula: adiciona a coluna `criticidade` | `inventario_atualizado.csv` |
| `Desafio1Status.java` | Adiciona a coluna `status`: Windows = Online, Linux = Em Monitoramento | `desafio1_status.csv` |
| `Desafio2Contador.java` | Conta quantos hosts usam Windows, Linux e macOS | `desafio2_contador.csv` |
| `Desafio3Criticos.java` | Gera um segundo CSV só com os hosts de criticidade Alta | `hosts_criticos.csv` |
| `Desafio4DataAuditoria.java` | Adiciona a coluna `data_auditoria` com a data do relatório | `desafio4_data_auditoria.csv` |
| `Desafio5Risco.java` | Adiciona a coluna `risco` (1 a 10): Alta = 9, Media = 5, Baixa = 2 | `desafio5_netsentinel.csv` |
| `hosts.csv` | Arquivo de dados (host, ip, so) | — |

## Como compilar

No terminal, dentro desta pasta, execute:

```bash
javac *.java
```

## Como executar

O `hosts.csv` precisa estar na pasta de onde o programa é executado. Exemplo:

```bash
java AtualizaInventario
java Desafio2Contador
```

## No IntelliJ

Crie uma classe com o nome de cada arquivo e cole o código. Coloque o `hosts.csv` na raiz do projeto, fora da pasta `src`. Os CSVs gerados aparecem também na raiz do projeto.
