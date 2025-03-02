package Alpha_23_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CWH_7_Bipartite_Graph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // create graph:
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }


    // Bipartite : O(V + E)
    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int col[] = new int[graph.length];        // color array
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;                          // no color
        }
        
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {                   // BFS
                q.add(i);
                col[i] = 0;                       // let assign yellow color

                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);   // neighbour  ->  e.dest

                        // case [3]: neighbour color not assign
                        if (col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }
                        // case [1]: neighbour color same 
                        else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                        // case [2]: continue
                    }
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // NOTE: If graph doesn't have cycle then it is -> "BiPartite Graph"
        /*
                    0 ------ 2
                   /        / 
                  /        / 
                 /        /
                1        4
                 \      /
                  \    /
                    3
        
            Return ->  FALSE
        */
        
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("Is Bipartite: " + isBipartite(graph));
    }
}