import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n, sum, cnt;
	static int[] num = { 1, 2, 3 };
	static int[] sel;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(bf.readLine());

		for (int t = 0; t < tc; t++) {
			n = Integer.parseInt(bf.readLine());

			sel = new int[n];
			sum = 0;
			cnt = 0;
			pow(0, 0);
			System.out.println(cnt + 1);
		}
	}

	private static void pow(int idx, int sum) {
		// System.out.println(Arrays.toString(sel));
		if (idx >= n) {
			return;
		}
		if (sum == n) {
			cnt++;
			return;
		}
		for (int i = 1; i <= 3; i++) {
			sel[idx] = i;
			pow(idx + 1, sum + sel[idx]);
		}
	}
}