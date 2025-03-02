package Alpha_23_Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class CWH_12_Dijkstra {
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

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }


    // Pair Class: (to store node and its shortest path from source)
    static class Pair implements Comparable<Pair>{
        int node;
        int path;   // weight

        public Pair(int n, int path) {
            this.node = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;           // path based sorting (small path comes first)
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int n = graph.length;
        int dist[] = new int[n];                  // dist[i]   ->   source to  i node 

        // Initialize
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;      // +Infinity
            }
        }

        boolean vis[] = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));           // source node with 0 path

        // loop for BFS
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();             // all time remove shortest pair

            if (!vis[curr.node]) {               // if curr node not visited then visit it
                vis[curr.node] = true;

                // neighbour
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;

                    if (dist[u] + wt < dist[v]) { // update distance of src to v
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        
        // print all source to vertices shortest path
        for (int i = 0; i < n; i++) {
            System.out.println("Shortest path from " + src + " to " + i + " is " + dist[i]);
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;

        dijkstra(graph, src);
    }
}
