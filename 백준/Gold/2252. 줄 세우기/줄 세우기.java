import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());

		List<Integer>[] adj = new ArrayList[n + 1];
		int[] idex = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			StringTokenizer str1 = new StringTokenizer(bf.readLine());
			int st = Integer.parseInt(str1.nextToken());
			int ed = Integer.parseInt(str1.nextToken());

			adj[st].add(ed);
			idex[ed]++;
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < n + 1; i++) {
			if (idex[i] == 0) {
				q.add(i);
			}
		}
		List<Integer> res = new LinkedList<>();

		while (!q.isEmpty()) {
			int curr = q.poll();
			res.add(curr);

			for (int i = 0; i < adj[curr].size(); i++) {
				int tmp = adj[curr].get(i);
				idex[tmp]--;
				if (idex[tmp] == 0) {
					q.add(tmp);
				}
			}
		}
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
	}
}
