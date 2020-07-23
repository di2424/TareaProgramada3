package ulead.ac.cr.logica;

import java.util.LinkedList;
import java.util.Stack;

    public class Profundidad {
        public  static LinkedList<String> depthFirstSearch(int[][] matrix, int source) {
            LinkedList<String>  list = new LinkedList<>();
            boolean[] visited = new boolean[matrix.length];
            visited[source - 1] = true;
            Stack<Integer> stack = new Stack<>();
            stack.push(source);
            System.out.println("****Grafo de profundidad****");
            System.out.println("Inicio del grafo: "+ source );

            int i, x;
            while (!stack.isEmpty()) {
                x = stack.pop();
                for (i = 0; i < matrix.length; i++) {
                    if (matrix[x - 1][i] == 1 && visited[i] == false) {
                        stack.push(x);
                        visited[i] = true;
                        String print= (x+ "---->" +  (i+1));
                        x = i + 1;
                        i = -1;

                        list.add(print);
                    }
                }
            }
            return list;
        }
    }


