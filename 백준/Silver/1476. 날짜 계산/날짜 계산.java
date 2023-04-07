import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int e, s, m, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		e = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int[] num = { 1, 1, 1 };
		cnt = 1;
		while (true) {
			if (num[0] == e && num[1] == s && num[2] == m) {
				System.out.println(cnt);
				break;
			}
			num[0]++;
			num[1]++;
			num[2]++;
			cnt++;
			if (num[0] > 15)
				num[0] = 1;
			if (num[1] > 28)
				num[1] = 1;
			if (num[2] > 19)
				num[2] = 1;
		}
	}
}