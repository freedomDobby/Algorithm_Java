import java.util.*;

class Main {
	static int[][] arr;
	static int N;
	static int max = 0;
	static int[] Rarr = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] Carr = { -1, 0, 1, 1, 1, 0, -1, -1 };

	// 좌 상단부터 시계방향
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			queen(0, i);
		}
		System.out.println(max / N);
	}

	static void queen(int R, int C) {
		if (R < N && arr[R][C] != 0) {
			return;
		}
		if (R == N) {
			max++;
			return;
		} else {
			attack(R, C, 1);
			for (int i = 0; i < N; i++) {
				queen(R + 1, i);
			}
			attack(R, C, -1);
		}
	}

	static void attack(int R, int C, int cnt) {
		arr[R][C] += cnt;
		for (int i = 1; i <= Math.max(Math.max(R, N - R - 1), Math.max(C, N - C - 1)); i++) {
			for (int j = 0; j < 8; j++) {
				int NR = R + i * Rarr[j];
				int NC = C + i * Carr[j];
				if (NR >= 0 && NC >= 0 && NR < N && NC < N) {
					arr[NR][NC] += cnt;
				}
			}
		}
	}
}