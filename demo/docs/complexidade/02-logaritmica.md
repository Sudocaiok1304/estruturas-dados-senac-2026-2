# Tempo Logarítmico — O(log n)

## O que é

Um algoritmo é O(log n) quando, a cada passo, ele **descarta uma parte do problema** (geralmente a metade), em vez de olhar para tudo. Por isso o número de passos cresce muito devagar conforme a entrada aumenta.

## Exemplo do projeto

Método `tempoLogaritmico` em [AnaliseComplexidade.java](../../src/main/java/com/example/AnaliseComplexidade.java):

```java
public void tempoLogaritmico(int n) {
    int valor = n;
    while (valor > 1) {
        valor = valor / 2;
    }
}
```

A cada iteração, `valor` é dividido por 2. Para n = 10, isso leva só ~3-4 passos. Para n = 1.000.000, leva só ~20 passos — o crescimento é muito mais lento que o da entrada.

## Analogia

Procurar uma palavra no dicionário: você abre no meio, vê se a palavra está antes ou depois, e descarta metade do dicionário a cada tentativa. Não precisa olhar página por página.

## Características

- Cresce muito mais devagar que O(n).
- Costuma aparecer quando o problema é dividido pela metade a cada passo.
- Exemplo clássico: busca binária em um vetor ordenado.
