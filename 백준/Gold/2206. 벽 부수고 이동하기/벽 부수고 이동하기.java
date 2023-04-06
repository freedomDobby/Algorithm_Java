import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, nextX, nextY;
	static int[][] map;
	static boolean[][][] visited;
	static int[] dr = { -1, 1, 0, 0 }; // 상 하 좌 우
	static int[] dc = { 0, 0, -1, 1 }; // 상 하 좌 우

	static class node {
		int nr, nc, dic;
		boolean flag;

		public node(int nr, int nc, int dic, boolean flag) {

			this.nr = nr;
			this.nc = nc;
			this.dic = dic;
			this.flag = flag;
		}

		@Override
		public String toString() {
			return "node [nr=" + nr + ", nc=" + nc + ", dic=" + dic + ", flag=" + flag + "]";
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visited = new boolean[n][m][2];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		BFS(0, 0);
	}

	// 얘는 길을 찾는 BFS
	// 그럼 벽을 부수는 BFS 따로? 아님 같이?
	private static void BFS(int x, int y) {
		// 미로 탐색이 불가능 할 경우
		Queue<node> q = new LinkedList<>();
		visited[x][y][0] = true;
		q.add(new node(0, 0, 0, false));

		while (!q.isEmpty()) {
			//System.out.println(q);
			node now = q.poll();
			if (now.nr == n - 1 && now.nc == m - 1) {
				System.out.println(now.dic +1);
				return;
			}

			for (int i = 0; i < 4; i++) {
				nextX = now.nr + dr[i];
				nextY = now.nc + dc[i];

				if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
					continue;
				}
				// 난 부신적 있어
				if (now.flag) {
					// 0일때만 이동
					if (!visited[nextX][nextY][1]) {
						if (map[nextX][nextY] == 0) {
							visited[nextX][nextY][1] = true;
							q.add(new node(nextX, nextY, now.dic + 1, true));
						}
					}
				}
				// 아직 안부셨어
				else {
					// 0이면 이동
					if (!visited[nextX][nextY][0]) {
						if (map[nextX][nextY] == 0) {
							visited[nextX][nextY][0] = true;
							q.add(new node(nextX, nextY, now.dic + 1, false));
						}
					}
					// 1이면 부수기
					if (map[nextX][nextY] == 1) {
						if (!visited[nextX][nextY][1]) {
							visited[nextX][nextY][1] = true;
							q.add(new node(nextX, nextY, now.dic + 1, true));
						}
					}
				}
			}
		}
		System.out.println(-1);
	}
}