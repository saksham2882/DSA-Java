package Alpha_23_Graph;

import java.util.ArrayList;

public class CWH_13_2_Bellman_Ford_with_different_graph_representation_method {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // create graph:
    static void createGraph(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    // O(V*E)
    public static void bellmanFord(ArrayList<Edge> graph, int src, int V) {
        int distance[] = new int[V];

        // Initialize:
        for (int i = 0; i < V; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE;   // +Infinity
            }
        }

        // Total T.C -> O(V*E)
        // Algo - O(V)
        for (int i = 0; i < V - 1; i++) {
            // Edge - O(E)
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j);
                // u, v, wt
                int u = e.src;
                int v = e.dest;
                int wt = e.weight;

                // Relaxation:
                if (distance[u] != Integer.MAX_VALUE && distance[u] + wt < distance[v]) {
                    distance[v] = distance[u] + wt;
                }
            }
        }

        // Print
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + " is at distance " + distance[i] + " from source " + src + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);

        int src = 0;

        bellmanFord(graph, src, V);
    }
}
