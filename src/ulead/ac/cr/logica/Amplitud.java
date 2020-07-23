package ulead.ac.cr.logica;

import java.util.LinkedList;
import java.util.Queue;

public class Amplitud {

        public  static LinkedList breadthFirstSearch(int[][] matrix, int source) {
            LinkedList<String>  List = new LinkedList<>();
            boolean[] visitado = new boolean[matrix.length];
            visitado[source - 1] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(source);
            System.out.println("* Grafo de Amplitud *");
            System.out.println("Inicio del grafo: "+ source );
            while (!queue.isEmpty()) {
                System.out.println(queue.peek());
                int x = queue.poll();
                int i;
                for (i = 0; i < matrix.length; i++) {
                    if (matrix[x - 1][i] == 1 && visitado[i] == false) {
                        queue.add(i + 1);
                        visitado[i] = true;
                        String print= (x+ "---->" +  (i+1) );
                        List.add(print);
                    }
                }
            }
            return List;
        }
    }

