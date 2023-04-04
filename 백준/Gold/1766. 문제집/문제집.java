import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(s.nextToken()); // 문제의 갯수
		int m = Integer.parseInt(s.nextToken()); // 먼저 풀면 좋은 수

		int[] nid = new int[n + 1];
		List<Integer>[] adj = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			StringTokenizer st1 = new StringTokenizer(bf.readLine());
			int st = Integer.parseInt(st1.nextToken());
			int ed = Integer.parseInt(st1.nextToken());

			adj[st].add(ed);
			nid[ed]++;
		}

		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 1; i <= n; i++) {
			if (nid[i] == 0) {
				q.add(i);
			}
		}

		List<Integer> res = new LinkedList<>();

		while (!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");
			for (int i = 0; i < adj[curr].size(); i++) {
				int tmp = adj[curr].get(i);
				nid[tmp]--;
				if (nid[tmp] == 0) {
					q.add(tmp);
				}
			}
		}
	}
}