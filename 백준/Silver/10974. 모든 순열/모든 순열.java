import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n;
	static int[] arr;
	static int[] sel;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());

		arr = new int[n + 1];
		sel = new int[n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i < n + 1; i++) {
			arr[i] = i;
		}
		// System.out.println(Arrays.toString(arr));

		pow(1, 0);
	}

	private static void pow(int idx, int sidx) {
		if (sidx == n) {
			for (int i = 1; i <= n; i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				sel[idx] = arr[i];
				pow(idx + 1, sidx + 1);
				visited[i] = false;
			}
		}

	}
}