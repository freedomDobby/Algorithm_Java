import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, sum, cnt;
	static int[] sel;

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