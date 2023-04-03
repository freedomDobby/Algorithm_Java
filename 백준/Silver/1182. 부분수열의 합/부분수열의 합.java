import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, s, cnt, ans;
	static int[] num;
	static int[] sel;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());

		num = new int[n];
		sel = new int[n];

		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st1.nextToken());
		}
		ans = 0;
		pow(0, 0, 0);
		System.out.println(ans);
	}

	private static void pow(int idx, int sum, int cnt) {
		if (idx == n) {
			if (cnt != 0 && sum == s) {
				ans += 1;
			}
			return;
		}
		pow(idx + 1, sum + num[idx], cnt + 1);
		pow(idx + 1, sum, cnt);
	}
}