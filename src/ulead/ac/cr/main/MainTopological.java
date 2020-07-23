package ulead.ac.cr.main;

import ulead.ac.cr.logica.TopologicalSort;

public class MainTopological {
    public static void main(String args[]) {
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Ordenamiento topologico del grafo: ");
        g.topologicalSort();
    }

}

