import java.util.*;

public class Main {
    static final int INF = 3000000;
    static int V, E, start;
    static int[] dist;
    static boolean[] visited;
    static List<Edge>[] edges;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        start = sc.nextInt();
        dist = new int[V+1];
        visited = new boolean[V+1];
        edges = new ArrayList[V+1];

        for (int i = 1; i <= V; i++) {
            dist[i] = INF;
            edges[i] = new ArrayList<>();
        }

        for (int i = 1; i <= E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            edges[u].add(new Edge(v, w));
        }

        dijkstra(start);

        for (int i = 1; i <= V; i++) {
            if (dist[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (visited[cur.vertex]) continue;
            visited[cur.vertex] = true;

            for (Edge edge : edges[cur.vertex]) {
                int next = edge.to;
                int weight = edge.weight;

                if (dist[next] > dist[cur.vertex] + weight) {
                    dist[next] = dist[cur.vertex] + weight;
                    pq.offer(new Node(next, dist[next]));
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        int vertex;
        int cost;

        Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}