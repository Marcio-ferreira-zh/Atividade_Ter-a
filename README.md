# Atividade — Grafos I (G2)

Trabalho de **Estrutura de Dados II**,  atividade do professor Ângelo Ferreira Guimarães.

## Enunciado

Implementar em Java as duas representações do grafo G2: **matriz de adjacência** e **lista de adjacência**.

- **Vértices:** 0, 1, 2, 3, 4, 5.
- **Arestas:** 0–1, 0–4, 1–2, 1–4, 2–3, 3–4, 3–5.
- **Tipo:** grafo não direcionado e não ponderado.

## (a) Desenho do grafo

Veja o arquivo [grafo-g2.svg](grafo-g2.svg) (pode ser aberto no navegador).

## (b) Matriz de adjacência

```text
    0 1 2 3 4 5
0 : 0 1 0 0 1 0
1 : 1 0 1 0 1 0
2 : 0 1 0 1 0 0
3 : 0 0 1 0 1 1
4 : 1 1 0 1 0 0
5 : 0 0 0 1 0 0
```

### Lista de adjacência

```text
0: 1, 4
1: 0, 2, 4
2: 1, 3
3: 2, 4, 5
4: 0, 1, 3
5: 3
```

## (c) Implementação em Java

O projeto contém três classes, sem bibliotecas externas:

- **`GrafoMatriz.java`**: guarda as conexões em `int[][]`. `adicionarAresta` marca as duas posições, `saoVizinhos` consulta a célula, e `grau` soma uma linha.
- **`GrafoLista.java`**: guarda os vizinhos em `List<List<Integer>>`. `adicionarAresta` inclui os dois sentidos, `saoVizinhos` usa `contains`, e `grau` retorna o tamanho da lista.
- **`Main.java`**: cria o grafo G2 nas duas representações e imprime matriz, listas, graus e respostas do item (d).

### Como executar

É necessário ter o **JDK (Java Development Kit)** instalado. Abra o terminal dentro desta pasta e execute:

```bash
javac Main.java GrafoMatriz.java GrafoLista.java
java Main
```

No Windows, pode abrir a pasta no VS Code e usar **Terminal > Novo Terminal** para executar esses comandos.

## (d) Respostas

| Vértice | Grau |
|---|---:|
| 0 | 2 |
| 1 | 3 |
| 2 | 2 |
| 3 | 3 |
| 4 | 3 |
| 5 | 1 |

- **Soma dos graus:** 14 (duas vezes as sete arestas).
- **Ciclo:** 0 → 1 → 4 → 0.
- **Menor caminho de 0 até 5:** 0 → 4 → 3 → 5, com **3 arestas**.

A menor distância é 3 porque o vértice 5 tem como único vizinho o 3, e não há aresta direta entre o vértice 0 e o 3.

## Publicar no GitHub

1. Entre no [GitHub](https://github.com) e crie um repositório **público ou privado**, com nome sugerido `atividade-grafos-g2`.
2. Ao criar, **não marque** as opções para adicionar um README ou `.gitignore`, pois este projeto já contém esses arquivos.
3. Abra o terminal nesta pasta e execute os comandos abaixo, substituindo `SEU_USUARIO` pelo seu nome de usuário no GitHub:

```bash
git init
git add .
git commit -m "Implementa matriz e lista de adjacencia do grafo G2"
git branch -M main
git remote add origin https://github.com/SEU_USUARIO/atividade-grafos-g2.git
git push -u origin main
```

Se o Git pedir nome e e-mail antes do commit, configure sua identidade com `git config --global user.name "Seu Nome"` e `git config --global user.email "seu-email@example.com"` (use seu e-mail verdadeiro). O GitHub pode pedir autenticação pelo navegador ou outra forma autorizada.

## Observação

O programa imprime um menor caminho identificado para este grafo específico. Não implementa BFS/DFS, que o material indica como tema da semana seguinte.
