# Regras dos Vetores

Vetores em Java seguem duas regras fundamentais. Nenhuma das duas é
"boa prática" — são regras da própria linguagem, impostas pelo
compilador.

Implementação de referência:
[RegrasVetores.java](../../src/main/java/com/example/RegrasVetores.java).

## Regra 1 — Um vetor só aceita um único tipo

Todo elemento de um vetor precisa ser compatível com o tipo declarado
do vetor. Isto **não compila**:

```java
int[] misturado = {15, "vinte", 42}; // erro de compilação
```

`"vinte"` é uma `String`, não um `int` — o compilador rejeita antes
mesmo do programa rodar.

### Por que essa regra existe

Um vetor é um bloco de memória **contíguo**, onde cada posição ocupa
sempre a **mesma quantidade de bytes** (por exemplo, 4 bytes para cada
`int`). Se fosse possível misturar tipos, o Java não saberia quantos
bytes reservar para cada posição, nem como interpretar o valor
guardado ali.

### A "exceção" que não quebra a regra: `Object[]`

```java
Object[] misturado = {10, "vinte", 3.14, true};
```

Isso compila, mas **não** viola a regra — o tipo declarado do vetor
continua sendo único: `Object`. Como, em Java, todo tipo referência "é
um" `Object`, qualquer objeto cabe ali.

O preço dessa flexibilidade: para usar o valor com seu tipo real, é
preciso fazer um *cast* explícito, e um cast errado só quebra em tempo
de **execução**, não de compilação:

```java
String texto = (String) misturado[0]; // ClassCastException!
// misturado[0] é um Integer, não uma String.
```

Por isso, para iniciantes, o recomendado é sempre usar vetores do tipo
específico (`int[]`, `String[]`, etc.) e evitar `Object[]` até dominar
bem herança e polimorfismo.

## Regra 2 — O tamanho de um vetor é fixo

Depois de criado com `new`, um vetor **não cresce nem encolhe**. Não
existe, em Java, um método para "adicionar" uma posição a um vetor já
existente:

```java
int[] numeros = new int[3];
numeros.add(40); // erro: vetores não têm método add()
```

### Como "aumentar" um vetor, na prática

A única forma é criar um vetor **novo**, maior, e copiar os valores
antigos para dentro dele:

```java
int[] numeros = new int[3];
int[] numerosMaior = new int[4];

for (int i = 0; i < numeros.length; i++) {
    numerosMaior[i] = numeros[i];
}
numerosMaior[3] = 40;
```

É exatamente esse processo de "criar maior e copiar" que estruturas
como `ArrayList` fazem automaticamente por baixo dos panos, escondendo
essa complexidade do programador.
