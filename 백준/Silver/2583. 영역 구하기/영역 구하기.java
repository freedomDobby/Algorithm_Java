import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, cnt;
	static boolean[][] visited;
	static List<Integer> ans;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken()); // 행
		n = Integer.parseInt(st.nextToken()); // 열
		int k = Integer.parseInt(st.nextToken()); // 직사각형 갯수

		visited = new boolean[m][n];
		ans = new ArrayList<>();
		cnt = 0;

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken()) - 1;
			int m2 = Integer.parseInt(st.nextToken()) - 1;

			// 좌표값에 맞게 박문철2 해주기
			for (int i1 = m1; i1 <= m2; i1++) {
				for (int j = n1; j <= n2; j++) {
					visited[i1][j] = true;
				}
			}
		} // 직사각형 좌표
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					visited[i][j] = true;
					BFS(i, j);
					ans.add(cnt);
					count++;
				}
			}
		}
		System.out.println(count);
		Collections.sort(ans);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	} // main

	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { x, y });
		visited[x][y] = true;
		cnt = 1;

		while (!q.isEmpty()) {
			int[] data = q.poll();
			int curX = data[0];
			int curY = data[1];

			// 델타
			for (int i = 0; i < 4; i++) {
				int nextX = curX + dr[i];
				int nextY = curY + dc[i];

				// 경계값
				if (nextX >= 0 && nextY >= 0 && nextX < m && nextY < n) {
					if (!visited[nextX][nextY]) {
						visited[nextX][nextY] = true;
						q.offer(new int[] { nextX, nextY });
						cnt++;
					}
				}
			}
		}
	} // BFS
}