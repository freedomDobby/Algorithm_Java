import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 집의 갯수
		int[][] cost = new int[n][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				cost[i][j] = sc.nextInt();
			}
		} // 주어진 가격 채워넣기

//		// 주어진 값 확인하는 배열
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(cost[i][j] + " ");
//			}
//			System.out.println();
//		}
//		// 확인 배열 끝

		for (int i = 1; i < n; i++) {
			cost[i][0] += Math.min(cost[i - 1][1], cost[i - 1][2]);
			cost[i][1] += Math.min(cost[i - 1][0], cost[i - 1][2]);
			cost[i][2] += Math.min(cost[i - 1][0], cost[i - 1][1]);
		}
		int min = Integer.MAX_VALUE;

		min = Math.min(Math.min(cost[n - 1][0], cost[n - 1][1]), cost[n - 1][2]);
		System.out.println(min);
	}
}