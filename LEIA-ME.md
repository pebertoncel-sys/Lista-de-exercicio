# Exercícios de Estruturas de Decisão em Java

Este pacote contém uma solução independente para cada uma das 14 questões do material **LOPAL — Estruturas de Decisão**. As soluções foram revisadas para que sejam arquivos Java completos e compiláveis.

## Como compilar

No terminal, dentro desta pasta, execute:

```bash
javac *.java
```

## Como executar

Cada programa recebe os dados pela entrada padrão, na ordem indicada no enunciado. Por exemplo:

```bash
echo "18" | java Questao01
echo "7500 720" | java Questao12
```

Para os exercícios com dois valores, informe os valores separados por espaço ou por linhas diferentes.

## Observações sobre as regras

- A questão 7 segue literalmente o enunciado: o funcionário precisa ter **mais de 3 meses**.
- A questão 12 exige renda **superior a R$ 8.000** e score **acima de 700**.
- A questão 14 concede isenção somente com saldo médio **superior a R$ 5.000**.
- Na questão 3, foi incluído um tratamento explícito para números iguais.
- Na questão 9, a comparação aceita `liderança` e `lideranca`.
