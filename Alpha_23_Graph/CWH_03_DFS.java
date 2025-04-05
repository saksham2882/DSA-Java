package Alpha_23_Graph;

import java.util.ArrayList;

public class CWH_03_DFS extends CWH_02_BFS{
    // DFS: O(V + E)
    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        // visit 
        System.out.print(curr + " ");
        vis[curr] = true;
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }
    
    public static void main(String[] args) {
        /*
                    1 ---- 3
                   /       | \
                  0        |  5 -- 6
                  \        | /
                   2 ----- 4 
        */

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[graph.length];

        DFS(graph, 0, vis);
    }
}
