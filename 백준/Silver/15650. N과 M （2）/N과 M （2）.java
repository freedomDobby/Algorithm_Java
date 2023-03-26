import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] sel;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		sel = new boolean[n];

		com(0, 0);
	}

	private static void com(int depth, int at) {
		if (depth == m) {
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
			return;
		}
		for (int i = at; i < n; i++) {
			if (!sel[i]) {
				sel[i] = true;
				arr[depth] = i + 1;
				com(depth + 1, i + 1);
				sel[i] = false;
			}
		}
	}
}