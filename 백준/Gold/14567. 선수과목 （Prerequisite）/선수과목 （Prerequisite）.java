import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] inDegree, result;
    static List<Integer>[] adjList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수

        inDegree = new int[N + 1];
        result = new int[N + 1];
        adjList = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st1.nextToken());
            int to = Integer.parseInt(st1.nextToken());

            adjList[from].add(to);
            inDegree[to]++;
        }

        topologicalSort();

        for (int i = 1; i <= N; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static void topologicalSort() {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
                
                        result[i] = 1;
        }
    }

    while (!queue.isEmpty()) {
        int current = queue.poll();

        for (int next : adjList[current]) {
            inDegree[next]--;

            if (inDegree[next] == 0) {
                queue.offer(next);
                result[next] = result[current] + 1;
            }
        }
    }
}}