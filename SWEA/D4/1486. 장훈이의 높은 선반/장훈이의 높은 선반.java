import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int n; // 점원의 수
	static int h; // 이상적인 점원들의 키의 합
	static int ans; //
	static int[] height; // 점원들 키를 받는 배열
	static boolean[] sel;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			n = sc.nextInt();
			h = sc.nextInt();

			height = new int[n];
			sel = new boolean[n];

			for (int i = 0; i < n; i++) {
				height[i] = sc.nextInt();
			}
			ans = Integer.MAX_VALUE;
			com(0);
			System.out.printf("#%d %d\n", t, ans - h);
		}
	}

	private static void com(int idx) {
		if (idx == n) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (sel[i]) {
					sum += height[i];
				}
				if (sum >= h) {
					ans = Math.min(ans, sum);
				}
			}
			return;
		}
		sel[idx] = true;
		com(idx + 1);
		sel[idx] = false;
		com(idx + 1);
	}
}