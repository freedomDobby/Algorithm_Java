import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] map = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j] = sc.nextInt();
			} // map 값 채우기
		}

//		// Checking map printer
//		for (int i = 0; i <= n; i++) {
//			for (int j = 0; j <= m; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		} // CMP


		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j] += Math.max(map[i][j-1], Math.max(map[i-1][j], map[i - 1][j - 1]));
			}
		}

		// dp[n][m]이 정답
		System.out.println(map[n][m]);

	}
}