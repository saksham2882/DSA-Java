package Alpha_23_Graph;

import java.util.ArrayList;

public class CWH_13_1_Bellman_Ford {
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
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src) {
        int V = graph.length;
        int distance[] = new int[V];

        // Initialize:
        for (int i = 0; i < V; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }

        // Total T.C ->    O(V*E)
        // Algo - O(V)
        for (int i = 0; i < V - 1; i++) {

            // for all edge - T.C of both combine loop - O(E)   (because it run only "E" times for "E" Edge)
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
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
        }

        // Print
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + " is at distance " + distance[i] + " from source " + src + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;

        bellmanFord(graph, src);
    }
}
