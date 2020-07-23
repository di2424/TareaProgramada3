package ulead.ac.cr.main;

import ulead.ac.cr.logica.Kruscal;

public class MainKruscal {
        public static void main(String[] args) {

            int adjacency_matrix[][] = {{0, 0, 0, 0},
                    {10, 0, 0, 0},
                    {6, 0, 0, 0},
                    {5, 15, 4, 0}};


            Kruscal graph = new Kruscal(adjacency_matrix);

            graph.getKruskalSolution();
            System.out.print(graph.result);

        }
    }

