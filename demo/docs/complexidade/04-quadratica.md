# Tempo Quadrático — O(n²)

## O que é

Um algoritmo é O(n²) quando ele tem **um laço dentro de outro laço**, e ambos dependem do tamanho da entrada. Para cada elemento, ele percorre todos os elementos de novo — o número de passos cresce muito mais rápido que a entrada.

## Exemplo do projeto

Método `tempoQuadratico` em [AnaliseComplexidade.java](../../src/main/java/com/example/AnaliseComplexidade.java):

```java
public void tempoQuadratico(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.println("Par: (" + i + ", " + j + ")");
        }
    }
}
```

Para n = 10, o laço interno roda 10 vezes para cada uma das 10 posições do laço externo: 10 × 10 = 100 passos. Se n dobrar para 20, o total vai para 400 passos — cresce muito mais rápido que a entrada.

## Analogia

Comparar cada aluno de uma turma com todos os outros alunos da mesma turma (para ver quem tem o mesmo aniversário, por exemplo). Com 10 alunos, são 100 comparações. Com 20 alunos, são 400.

## Características

- Dois laços aninhados, ambos dependentes de `n`.
- É bem mais lento que O(n) conforme a entrada cresce.
- Exemplos comuns: comparar todos os pares de uma lista, ordenação por bolha (bubble sort).
