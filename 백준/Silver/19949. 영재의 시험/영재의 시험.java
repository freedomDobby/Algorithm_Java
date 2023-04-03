import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int ans;
	static int[] score;
	static int[] output;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		score = new int[10];
		output = new int[10];

		for (int i = 0; i < 10; i++) {
			score[i] = Integer.valueOf(st.nextToken());
		}

		ans = 0;
		DFS(0); // 깊이탐색
		System.out.println(ans);
	}

	private static void DFS(int idx) {
		if (idx == 10) {
			int cnt = 0;
			for (int i = 0; i < 10; i++) {
				if (score[i] == output[i]) {
					cnt++;
				}
			}
			if (cnt >= 5) {
				ans++;
			}
			return;
		}
		for (int i = 1; i <= 5; i++) {
			if (idx >= 2) {
				if (output[idx - 1] == i && output[idx - 2] == i)
					continue;
			}
			output[idx] = i;
			DFS(idx + 1);
		}
	}
}
