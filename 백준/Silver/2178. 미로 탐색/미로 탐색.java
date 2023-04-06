import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int n, m, nextX, nextY;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		visited[0][0] = true;
		BFS(0, 0);
//		//
//		for (int i1 = 0; i1 < n; i1++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(map[i1][j] + " ");
//			}
//			System.out.println();
//		}
//		//
		//System.out.printf("nextX : %d nextY : %d\n", nextX, nextY);
		// Answer
		System.out.println(map[n-1][m-1]);

	}

	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y }); // 이 형식이 어색

		// q가 빌 때까지
		while (!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];

			for (int i = 0; i < 4; i++) {
				nextX = nowX + dr[i];
				nextY = nowY + dc[i];

				// 경계값 설정
				if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
					continue;
				}
				if (visited[nextX][nextY] || map[nextX][nextY] == 0) {
					continue;
				}

				q.add(new int[] { nextX, nextY });
				map[nextX][nextY] = map[nowX][nowY] + 1;
				visited[nextX][nextY] = true;
			}
		}

	}
}