# Declaração e Construção de Vetores

## O que é um vetor

Um vetor (array) é um bloco de memória de **tamanho fixo** que guarda
vários valores do **mesmo tipo**, acessados por um índice numérico que
começa em `0`. Se um vetor tem 5 posições, os índices válidos são
`0, 1, 2, 3, 4`.

## Formas de declarar e criar um vetor

Todas as formas abaixo estão implementadas em
[DeclaracaoVetores.java](../../src/main/java/com/example/DeclaracaoVetores.java).

### 1. Em duas etapas (declarar, depois criar)

```java
int[] vetorA;       // só declara a variável, ainda não existe vetor
vetorA = new int[5]; // agora sim, cria o vetor com 5 posições
```

Útil quando você não sabe, no momento da declaração, qual será o
tamanho do vetor (por exemplo, o tamanho vem de uma entrada do
usuário mais adiante no código).

### 2. Declaração + criação na mesma linha, sem valores

```java
int[] vetorB = new int[3];
```

Cria um vetor de 3 posições, todas com o valor padrão do tipo (para
`int`, o padrão é `0`).

### 3. Declaração + criação com valores, usando `new`

```java
int[] vetorC = new int[]{10, 20, 30};
```

O tamanho (`3`) é deduzido automaticamente pela quantidade de valores
informados entre chaves — não se informa o número entre colchetes.

### 4. Forma resumida (literal), só na declaração

```java
int[] vetorD = {100, 200, 300, 400};
```

É a forma mais curta, mas só pode ser usada **na mesma linha** em que
a variável é declarada. Isto **não compila**:

```java
int[] vetorE;
vetorE = {1, 2, 3}; // erro de compilação
```

Nesse caso seria obrigatório escrever `vetorE = new int[]{1, 2, 3};`.

## Por que isso importa

Saber todas essas formas ajuda a reconhecer o mesmo conceito escrito de
jeitos diferentes em códigos de terceiros, e a escolher a forma mais
legível para cada situação (normalmente, prefira a forma resumida
quando os valores já são conhecidos de antemão).
