import java.awt.Adjustable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M, R, cnt;
	static int[] order;
	static boolean[] visited;
	static List<Integer> adj[];
	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();

		order = new int[N + 1];
		visited = new boolean[N + 1];
		adj = new ArrayList[N + 1];

		for (int i = 0; i < N + 1; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			adj[st].add(ed);
			adj[ed].add(st);
		}

		for (int i = 0; i < N+1; i++) {
			Collections.sort(adj[i], Collections.reverseOrder());
		}

		StringBuilder sb = new StringBuilder();
		cnt = 0;
		BFS(R);
		// System.out.println(Arrays.toString(order));

		for (int i = 1; i < N + 1; i++) {
			sb.append(order[i]).append('\n');
		}
		System.out.println(sb);
	}

	private static void BFS(int v) {
		visited[v] = true;
		order[v] = ++cnt;
		q.offer(v);

		while (!q.isEmpty()) {
			int a = q.poll();
			for (int i = 0; i < adj[a].size(); i++) {
				int nextV = adj[a].get(i);

				if (visited[nextV]) {
					continue;
				}

				q.offer(nextV);
				visited[nextV] = true;
				order[nextV] = ++cnt;
			}
		}
	}
}