package ulead.ac.cr.main;

import ulead.ac.cr.logica.Amplitud;

import java.util.LinkedList;

public class MainAmplitud {
    public static void main(String[] args) {
        LinkedList<String> listAmplitud = new LinkedList<>();
        Amplitud amplitud = new Amplitud();
        int matrix [][] =  {{0,1,0,1,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,1,0,0},
                {1,1,0,0,1,1,0},
                {0,1,1,1,0,1,1},
                {0,0,0,1,1,0,1},
                {0,0,0,0,1,1,0}};
        listAmplitud = Amplitud.breadthFirstSearch(matrix, 1);
        for (int i =0; i<listAmplitud.size(); i++) {
            System.out.println(listAmplitud.get(i));
        }
    }
}
