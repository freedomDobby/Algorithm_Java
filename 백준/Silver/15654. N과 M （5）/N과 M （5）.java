import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static int[] sel;
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n];
		sel = new int[n];
		visit = new boolean[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		//System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		com(0);
		System.out.println(sb);

	}

	private static void com(int idx) {
		
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(sel[i] + " ");
			}
			sb.append("\n");
		}
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				sel[idx] = arr[i];
				com(idx + 1);
				visit[i] = false;
				//System.out.println(Arrays.toString(sel));
			}
		}
	}
}