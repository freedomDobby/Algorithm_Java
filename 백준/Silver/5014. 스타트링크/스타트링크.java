import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int f, s, g, u, d;
	static int[] dist;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		dist = new int[1000001];
		visited = new boolean[1000001];

		f = Integer.parseInt(st.nextToken()); // 건물의 높이(경계값)
		s = Integer.parseInt(st.nextToken()); // 강호의 위치
		g = Integer.parseInt(st.nextToken()); // 목적지
		u = Integer.parseInt(st.nextToken()); // u층 만큼 위로 올라감
		d = Integer.parseInt(st.nextToken()); // d층 만큼 아래로 내려감

		BFS(s);

	}

	private static void BFS(int idx) {
		Queue<Integer> q = new LinkedList<>();
		q.add(idx);
		visited[idx] = true;

		while (!q.isEmpty()) {
			int curr = q.poll();

			if (curr + u <= f) {
				if (!visited[curr + u]) {
					q.add(curr + u);
					dist[curr + u] = dist[curr] + 1;
					visited[curr + u] = true;
				}
			}
			if (curr - d > 0) {
				if (!visited[curr - d]) {
					q.add(curr - d);
					dist[curr - d] = dist[curr] + 1;
					visited[curr - d] = true;
				}
			}
			if (curr == g) {
				System.out.println(dist[g]);
				return;
			}
		} // while
		if (q.isEmpty()) {
			System.out.println("use the stairs");
		}
	}
}