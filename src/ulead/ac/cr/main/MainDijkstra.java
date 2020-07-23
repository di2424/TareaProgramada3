package ulead.ac.cr.main;

import ulead.ac.cr.logica.Dijkstra;
import ulead.ac.cr.logica.DijkstraPrint;

public class MainDijkstra {
    public static void main(String... arg) {
        int source =1;

        int L= Integer.MAX_VALUE;

        int adjacency_matrix[][] = {{0, 10, 0, 0, 0, 0},
                {0,0, 15, 0, 0, 0},
                {15, 0, 0, 4, 10, 0},
                {0, 12, 4, 0, 2, 1},
                {0, 0, 4, 0, 0, 0},
                {0, 15, 4, 0, 5, 0}};

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(adjacency_matrix,source);
        DijkstraPrint id = new DijkstraPrint(dijkstra.startVertexP, dijkstra.distancesP, dijkstra.parentsP);


    }
}

