# Prompts para geração de imagens (Gemini)

Este arquivo reúne prompts prontos para gerar, no Gemini, uma imagem
ilustrativa para cada uma das quatro complexidades de tempo trabalhadas
nesta aula. Cada prompt foi pensado para gerar um diagrama didático,
em estilo de slide de aula, coerente com a explicação do respectivo
arquivo `.md`.

Sugestão de uso: gere uma imagem por prompt e salve como
`constante.png`, `logaritmica.png`, `linear.png` e `quadratica.png`
dentro desta mesma pasta (`demo/docs/complexidade/`), referenciando-as
nos arquivos `01-constante.md`, `02-logaritmica.md`, `03-linear.md` e
`04-quadratica.md`.

---

## 1. Tempo Constante — O(1)

```
Crie uma ilustração didática, estilo slide de aula de algoritmos, para
explicar complexidade de tempo O(1) - Tempo Constante.

Mostre uma estante com 10 livros enfileirados, com uma seta apontando
diretamente para o primeiro livro da esquerda, indicando acesso
imediato, sem precisar olhar os demais livros. Ao lado, mostre a mesma
cena mas com uma estante de 1000 livros, com a mesma seta apontando
direto para o primeiro livro, com o texto "mesmo tempo, não importa o
tamanho".

Inclua o texto "O(1) - Tempo Constante" como título, em destaque.
Estilo flat design, cores simples e contrastantes, fundo claro,
visual limpo e educativo, sem textos longos, adequado para slide de
sala de aula.
```

---

## 2. Tempo Logarítmico — O(log n)

```
Crie uma ilustração didática, estilo slide de aula de algoritmos, para
explicar complexidade de tempo O(log n) - Tempo Logarítmico.

Mostre um dicionário grosso sendo aberto ao meio, com uma seta
dividindo o livro em duas metades, uma delas ficando esmaecida
(descartada) e a outra em destaque. Repita esse processo em miniatura
mais duas vezes, cada vez com a metade restante sendo dividida
novamente ao meio, até restar uma única página em destaque.

Inclua setas numeradas (1, 2, 3) indicando cada divisão, e o texto
"a cada passo, metade do problema é descartada".

Inclua o texto "O(log n) - Tempo Logarítmico" como título, em destaque.
Estilo flat design, cores simples e contrastantes, fundo claro,
visual limpo e educativo, adequado para slide de sala de aula.
```

---

## 3. Tempo Linear — O(n)

```
Crie uma ilustração didática, estilo slide de aula de algoritmos, para
explicar complexidade de tempo O(n) - Tempo Linear.

Mostre uma fileira de 10 cartas numeradas de 0 a 9, dispostas em linha
reta, com uma lupa ou dedo indicador passando por cima de cada carta,
uma de cada vez, da esquerda para a direita, em ordem sequencial.
Adicione pequenas setas ligando cada carta à próxima, reforçando a
ideia de percurso sequencial, um elemento por vez, sem pular nenhum.

Inclua o texto "1 elemento = 1 passo" e o título
"O(n) - Tempo Linear" em destaque.
Estilo flat design, cores simples e contrastantes, fundo claro,
visual limpo e educativo, adequado para slide de sala de aula.
```

---

## 4. Tempo Quadrático — O(n²)

```
Crie uma ilustração didática, estilo slide de aula de algoritmos, para
explicar complexidade de tempo O(n²) - Tempo Quadrático.

Mostre uma grade (tabela) 10x10 de pontos ou quadrados, representando
todos os pares possíveis entre 10 elementos. Destaque visualmente que,
para cada uma das 10 linhas, percorre-se as 10 colunas novamente,
usando setas em zigue-zague ou uma varredura linha por linha, coluna
por coluna. Ao lado, mostre o cálculo "10 x 10 = 100 passos" de forma
grande e visível.

Inclua o texto "para cada elemento, percorremos todos os outros de
novo" e o título "O(n²) - Tempo Quadrático" em destaque.
Estilo flat design, cores simples e contrastantes, fundo claro,
visual limpo e educativo, adequado para slide de sala de aula.
```
