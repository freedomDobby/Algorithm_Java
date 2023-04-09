import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, m, a, b, cnt;
	static int ans = -1;
	static ArrayList<Integer> adj[];
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		m = sc.nextInt();

		adj = new ArrayList[n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			adj[st].add(ed);
			adj[ed].add(st);
		}

		//System.out.println(Arrays.toString(adj));

		DFS(a, 0);
		System.out.println(ans);
	}

	private static void DFS(int find, int cnt) {
		visited[find] = true;

		for (int i : adj[find]) {
			// 찾는 노드가 같다는 것을 판단할 무언가
			if (!visited[i]) {
				if (i == b) {
					ans = cnt + 1;
					return;
				}
				DFS(i, cnt + 1);
			}
		}
	}
}