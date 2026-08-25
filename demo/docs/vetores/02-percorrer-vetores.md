# Percorrer Vetores

## O que significa "percorrer"

Percorrer um vetor é visitar todos os seus elementos, um de cada vez,
geralmente para ler, imprimir ou processar cada valor. Não importa a
forma escolhida, percorrer um vetor de `n` elementos sempre custa
O(n) — ver [03-linear.md](../complexidade/03-linear.md).

Implementação de referência:
[PercorrerVetores.java](../../src/main/java/com/example/PercorrerVetores.java).

## Formas de percorrer

### 1. `for` tradicional (com índice)

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

- `numeros.length` é o **tamanho** do vetor (quantidade de posições),
  não o último índice válido — por isso a condição é `i < length`, e
  não `i <= length`.
- Como temos `i`, sabemos a posição de cada elemento e podemos
  **alterar** o vetor original (`numeros[i] = novoValor;`).

### 2. `for-each` (for aprimorado)

```java
for (int numero : numeros) {
    System.out.println(numero);
}
```

- Lê-se "para cada `numero` dentro de `numeros`".
- Mais simples quando só precisamos do **valor**, não da posição.
- A variável `numero` recebe uma **cópia** do valor — alterá-la não
  muda o vetor original.

### 3. `while` com índice manual

```java
int i = 0;
while (i < numeros.length) {
    System.out.println(numeros[i]);
    i++;
}
```

- Faz o mesmo que o `for` tradicional, mas separa manualmente a
  inicialização, a condição e o incremento do índice.
- Serve para reforçar que o `for` é, por baixo dos panos, essas três
  partes organizadas em uma única linha.

## Qual escolher?

| Preciso de...                          | Use            |
|-----------------------------------------|----------------|
| Só o valor de cada elemento              | `for-each`     |
| A posição (índice) de cada elemento      | `for` tradicional |
| Alterar os valores do vetor original     | `for` tradicional |
| Parar o laço em uma condição não ligada ao índice | `while` |
