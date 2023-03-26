import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] sel;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];
		sel = new boolean[n];

		com(0);
		System.out.println(sb);
	}

	private static void com(int idx) {
		if (idx == m) {
			for (int var : arr) {
				sb.append(var + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			sel[i] = true;
			arr[idx] = i + 1;
			com(idx + 1);
		}
	}
}