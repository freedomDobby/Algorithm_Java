import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N, M, R, cnt;
	static boolean[] visited;
	static int[] order;
	static List<Integer>[] adjList;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();

		visited = new boolean[N + 1];
		order = new int[N + 1];

		// 간선 입렵받기
		adjList = new ArrayList[N + 1];

		for (int i = 0; i < N + 1; i++) {
			adjList[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			adjList[st].add(ed);
			adjList[ed].add(st);
		}

		for (int i = 0; i < N + 1; i++) {
			Collections.sort(adjList[i], Collections.reverseOrder());
		}

		// System.out.println(Arrays.toString(adjList));
		StringBuilder sb = new StringBuilder();
		DFS(R);

		for (int i = 1; i < N + 1; i++) {
			sb.append(order[i]).append('\n');
		}
		System.out.println(sb);
	}

	private static void DFS(int v) {
		if (!visited[v]) {
			visited[v] = true;
			order[v] = ++cnt;
			for (int i = 0; i < adjList[v].size(); i++) {
				DFS(adjList[v].get(i));
			}
		}
	}
}