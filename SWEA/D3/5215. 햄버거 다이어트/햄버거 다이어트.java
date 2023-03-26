import java.util.Scanner;

public class Solution {
	static int n; //전체 재료 갯수
	static int l; //칼로리
	static int[] score;
	static boolean[] sel;
	static int[] kal;
	static int max_happy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			n = sc.nextInt();
			l = sc.nextInt();

			score = new int[n];
			sel = new boolean[n];
			kal = new int[n];

			for (int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
				kal[i] = sc.nextInt();
			}

			max_happy = Integer.MIN_VALUE;
			com(0, 0, 0);
			System.out.printf("#%d %d\n", t, max_happy);

		} // TestCaseLoop
	}

	private static void com(int idx, int sum_s, int sum_k) {
		if (idx == n) {
			if (sum_k <= l) {
				if (sum_s > max_happy) {
					max_happy = sum_s;
				}
			}
			return;
		}

		// 재료 선택 O
		sel[idx] = true;
		com(idx + 1, sum_s + score[idx], sum_k + kal[idx]);
		// 재료 선택 X
		sel[idx] = false;
		com(idx + 1, sum_s, sum_k);

	}
}