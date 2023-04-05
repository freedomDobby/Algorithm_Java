import java.util.Scanner;

public class Solution {
	static int n, w, h, min, sum;
	static int[] ans;
	static int[][] map;
	static int[][] realMap;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			n = sc.nextInt();
			w = sc.nextInt();
			h = sc.nextInt();

			realMap = new int[h][w];
			map = new int[h][w];
			ans = new int[n];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					realMap[i][j] = sc.nextInt();
				}
			}

//		showMap();
			min = Integer.MAX_VALUE;
			pow(0);
			System.out.printf("#%d %d\n", t, min);
		}
	} // main 함수 끝

	private static void pow(int idx) {
		if (idx == n) {
			// 배열 복사하기
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = realMap[i][j];
				}
			} // copy

			// N개를 골라 중복 순열 돌리기
			for (int i = 0; i < n; i++) {
				for (int x = 0; x < h; x++) {
					if (map[x][ans[i] - 1] != 0) {
						boom(x, ans[i] - 1);
						gravity();
						break;
					} else
						continue;
				}
			}
			sum = 0;
			check(map);

			if (sum < min) {
				min = sum;
			}
			return;
		}

		// re~~
		for (int i = 1; i <= w; i++) {
			ans[idx] = i;
			pow(idx + 1);
		}
	} // pow 함수 끝

	private static void gravity() {
		for (int j = 0; j < w; j++) {
			for (int i = h - 1; i >= 0; i--) {
				// 빈 공간이 있다면
				if (map[i][j] == 0) {
					for (int k = i - 1; k >= 0; k--) {
						if (map[k][j] != 0) {
							// 집어넣자
							map[i][j] = map[k][j];
							map[k][j] = 0;
							break;
						}
					}
				}
			}
		}
	} // gravity 끝

	private static void boom(int x, int y) {
		// 벽돌 있는 것만 붐붐따
		if (map[x][y] != 0) {
			int num = map[x][y];
			// 터졌음 0으로
			map[x][y] = 0;

			// 델타 돌려줄께여~
			for (int c = 0; c < num; c++) {
				int[] nr = { -c, c, 0, 0 };
				int[] nc = { 0, 0, -c, c };

				for (int dir = 0; dir < 4; dir++) {
					int dr = x + nr[dir];
					int dc = y + nc[dir];
					if (dr < 0 || dc < 0 || dr >= h || dc >= w) {
						continue;
					}
					boom(dr, dc);
				}
			}
		}
	} // boom 끗

	private static void check(int map[][]) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] != 0)
					sum++;
			}
		}
	} // check 끝

//	// 2차 배열 확인하는 메서드
//	private static void showMap() {
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j < w; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
//	} // 2차 배열 보기 끝
}