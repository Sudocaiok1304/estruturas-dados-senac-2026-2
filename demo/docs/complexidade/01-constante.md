# Tempo Constante — O(1)

## O que é

Um algoritmo é O(1) quando o número de passos que ele executa **não depende do tamanho da entrada**. Não importa se o vetor tem 10 ou 10 milhões de elementos, o tempo de execução é sempre o mesmo.

## Exemplo do projeto

Método `tempoConstante` em [AnaliseComplexidade.java](../../src/main/java/com/example/AnaliseComplexidade.java):

```java
public void tempoConstante(int[] numeros) {
    System.out.println(numeros[0]);
}
```

Acessar `numeros[0]` é sempre 1 operação, seja qual for o tamanho do vetor.

## Analogia

Pegar o primeiro livro de uma estante. Não importa se a estante tem 10 ou 10.000 livros — pegar o primeiro é sempre imediato.

## Características

- Não tem laços dependentes do tamanho da entrada.
- É a complexidade mais rápida possível.
- Exemplos comuns: acessar um índice de array, empilhar/desempilhar (push/pop), verificar se uma lista está vazia.
