package Alpha_23_Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class CWH_14_Prims_Algo {
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

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    // Pair class
    static class Pair implements Comparable<Pair> {
        int vertex;
        int cost;

        public Pair(int v, int c){
            this.vertex = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    // Prims Algorithm: 
    public static int MST(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0;            // MST cost

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.vertex]){
                vis[curr.vertex] = true;
                finalCost += curr.cost;

                // check for neighbour
                for(int i=0; i<graph[curr.vertex].size(); i++){
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }

        return finalCost;
    }


    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("Final cost of MST: " + MST(graph));
    }
}
