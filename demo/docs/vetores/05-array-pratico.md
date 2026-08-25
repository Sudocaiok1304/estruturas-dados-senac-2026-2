# Arrayzinho Prático — Notas de 5 Alunos

## Objetivo

Juntar, em um único exercício simples, os conceitos revisados nos
arquivos anteriores: declarar um vetor pequeno
([01-declaracao-vetores.md](01-declaracao-vetores.md)), percorrê-lo
([02-percorrer-vetores.md](02-percorrer-vetores.md)) e trabalhar com um
tipo específico, `double`
([03-tipos-de-vetores.md](03-tipos-de-vetores.md)).

Implementação de referência:
[ArrayPratico.java](../../src/main/java/com/example/ArrayPratico.java).

## Cenário

Um vetor com as notas de 5 alunos:

```java
double[] notas = {7.5, 4.0, 6.0, 9.8, 5.5};
```

O programa:

1. Percorre o vetor com o `for` tradicional (precisamos do índice para
   mostrar "aluno número tal").
2. Para cada nota, verifica se ela é maior ou igual à nota de corte
   (`6.0`) e imprime se o aluno foi aprovado ou reprovado.
3. Conta quantos alunos foram aprovados, usando uma variável contadora
   que começa em `0` e é incrementada a cada aprovação encontrada.
4. Ao final, imprime o total de alunos (`notas.length`) e o total de
   aprovados.

## Por que este exercício

Ele é propositalmente simples — sem recursão, sem algoritmos
complicados — para servir de "ponto de virada": depois de revisar
declaração, percurso, tipos e regras separadamente, este exercício
mostra os quatro conceitos trabalhando juntos em um problema pequeno e
concreto, antes de avançarmos para estruturas mais elaboradas (como
listas encadeadas).
