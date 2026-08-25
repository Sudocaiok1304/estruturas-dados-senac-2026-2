# Tempo Linear — O(n)

## O que é

Um algoritmo é O(n) quando o número de passos **cresce na mesma proporção** do tamanho da entrada. Se a entrada dobra, o tempo de execução também dobra.

## Exemplo do projeto

Método `tempoLinear` em [AnaliseComplexidade.java](../../src/main/java/com/example/AnaliseComplexidade.java):

```java
public void tempoLinear(int n) {
    for (int i = 0; i < n; i++) {
        System.out.println("Contando: " + i);
    }
}
```

Um único laço `for` percorrendo os `n` números. Para n = 10, são 10 passos. Para n = 20, são 20 passos.

## Analogia

Ler todas as páginas de um livro, uma por uma, para contar quantas têm uma determinada palavra. Se o livro dobrar de tamanho, o tempo de leitura dobra também.

## Características

- Um único laço que percorre toda a entrada uma vez.
- Exemplos comuns: percorrer um vetor, somar todos os elementos de uma lista, busca linear.
