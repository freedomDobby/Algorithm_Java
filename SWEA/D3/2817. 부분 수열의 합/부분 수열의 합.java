import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int n;
	static int k;
	static int[] arr;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			n = sc.nextInt();
			k = sc.nextInt();

			arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			cnt = 0;
			com(0, 0);
			System.out.printf("#%d %d\n", t, cnt);
		} // TestCaseLoop
	}

	private static void com(int idx, int sum) {
		if (sum == k) {
			cnt++;
			return;
		}
		if (sum > k || idx == n) {
			return;
		}

		com(idx + 1, sum + arr[idx]);

		com(idx+1, sum);

	}
}