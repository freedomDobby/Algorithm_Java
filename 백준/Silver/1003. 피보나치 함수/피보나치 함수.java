import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP를 공부해 봅시다.
public class Main {
	static long[] arr;
	static int n, zCnt, oCnt;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int t = 0; t < tc; t++) {
			n = Integer.parseInt(br.readLine());
			Fib(n);
			sb.append(zCnt).append(" ").append(oCnt).append('\n');
			zCnt = 0;
			oCnt = 0;
		} // TestCaseLoop
		System.out.println(sb);
	}

	private static void Fib(int num) {
		int tmp0 = 0;
		int tmp1 = 1;
		int tmp = 0;

		if (n == 0) {
			zCnt++;
			return;
		} else if (n == 1) {
			oCnt++;
		} else {
			for (int i = 1; i < n; i++) {
				tmp = tmp0 + tmp1;
				tmp0 = tmp1;
				tmp1 = tmp;
			}
			zCnt = tmp0;
			oCnt = tmp1;
		}
	}
}