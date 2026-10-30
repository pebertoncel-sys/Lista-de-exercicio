# BufferedReader e Manipulação de Strings em Java

Soluções dos desafios do material **UC - LOPAL JAVA: BufferedReader e Manipulação de Strings** (Dia 20 — Leitura e Escrita de Arquivos em Java). Todos os programas leem o arquivo `ativos.csv` linha a linha com `BufferedReader`, ignoram o cabeçalho e separam os campos com `split(",")`.

## Arquivos

| Arquivo | O que faz |
|---|---|
| `Main.java` | Algoritmo completo: mostra host, IP e sistema de cada ativo |
| `Desafio1.java` | Exibe apenas os nomes dos hosts |
| `Desafio2.java` | Conta quantos dispositivos existem no arquivo |
| `Desafio3.java` | Exibe apenas os equipamentos Linux |
| `Desafio4.java` | Exibe apenas os IPs dos equipamentos Windows |
| `DesafioFinal.java` | Relatório com o total de ativos e a contagem por sistema operacional |
| `ativos.csv` | Arquivo de dados (HOST, IP, SISTEMA_OPERACIONAL) |

## Como compilar

No terminal, dentro desta pasta, execute:

```bash
javac *.java
```

## Como executar

O `ativos.csv` precisa estar na pasta de onde o programa é executado. Por exemplo:

```bash
java Desafio2
java DesafioFinal
```

No IntelliJ, coloque o `ativos.csv` na raiz do projeto (fora da pasta `src`).

## Observações

- Os campos passam por `trim()` para remover espaços extras, como em `SRVWEB01,192.168.1.10, Linux`.
- No Desafio Final, além de Linux, Windows e Firewall, foi incluída a linha **Outros** (switches, roteadores, câmeras, impressoras etc.) para que a soma bata com o total de ativos.
