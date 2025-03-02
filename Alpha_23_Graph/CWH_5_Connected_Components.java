package Alpha_23_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CWH_5_Connected_Components {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // create graph:
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        // Disconnected component
        // No need to add an edge, just keep graph[6] empty
    }


    // BFS for disjoint edge (connected component):
    public static void BFS(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(graph, vis, i);
            }
        }
    }

    // BFS Util: O(V + E)
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);             // source = start

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {     // visit curr
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }



    // DFS for disjoint edge (connected component):
    public static void DFS(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {        // Only start DFS if node is unvisited
                dfsUtil(graph, i, vis);
            }
        }
    }


    // DFS: O(V + E)
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        /*
                    1 ---- 3
                   /       | \
                  0        |  5   6
                  \        | /
                   2 ----- 4 
        */

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("BFS Traversal: ");
        BFS(graph);

        System.out.println("\nDFS Traversal: ");
        DFS(graph);
    }
}
