public class Main {
    public static void main(String[] args) {
        int n = 6;
        // Arestas do grafo
        int[][] arestas = {
            {0, 1}, {0, 4}, {1, 2}, {1, 4},
            {2, 3}, {3, 4}, {3, 5}
        };

        GrafoMatriz matriz = new GrafoMatriz(n);
        GrafoLista lista = new GrafoLista(n);

        for (int[] aresta : arestas) {
            matriz.adicionarAresta(aresta[0], aresta[1]);
            lista.adicionarAresta(aresta[0], aresta[1]);
        }

        System.out.println("GRAFO G2 - MATRIZ DE ADJACENCIA");
        System.out.print("    ");
        for (int v = 0; v < n; v++) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int u = 0; u < n; u++) {
            System.out.print(u + " : ");
            for (int v = 0; v < n; v++) {
                System.out.print((matriz.saoVizinhos(u, v) ? 1 : 0) + " ");
            }
            System.out.println();
        }

        System.out.println("\nGRAFO G2 - LISTA DE ADJACENCIA");
        for (int u = 0; u < n; u++) {
            System.out.print(u + ": ");
            boolean primeiro = true;
            for (int v = 0; v < n; v++) {
                if (lista.saoVizinhos(u, v)) {
                    if (!primeiro) {
                        System.out.print(", ");
                    }
                    System.out.print(v);
                    primeiro = false;
                }
            }
            System.out.println();
        }

        System.out.println("\nGRAU DE CADA VERTICE");
        for (int u = 0; u < n; u++) {
            System.out.println("Vertice " + u + ": " + matriz.grau(u)
                + " (matriz), " + lista.grau(u) + " (lista)");
        }

        System.out.println("\nExemplo de ciclo: 0 -> 1 -> 4 -> 0");
        System.out.println("Menor caminho de 0 ate 5: 0 -> 4 -> 3 -> 5 (3 arestas)");
    }
}
