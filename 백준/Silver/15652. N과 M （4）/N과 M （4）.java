import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static int[] arr1;
	static boolean[] sel;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n];
		arr1 = new int[n];
		sel = new boolean[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		com(0, 0);
		System.out.println(sb);
	}

	private static void com(int idx, int at) {
		if (idx == m) {
			for (int var = 0; var < m; var++) {
				sb.append(arr1[var] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = at; i < n; i++) {
			// if (!sel[i]) {
			// sel[i] = true;
			arr1[idx] = arr[i];
			com(idx + 1, i);
			// sel[i] = false;
			// }
		}
	}
}