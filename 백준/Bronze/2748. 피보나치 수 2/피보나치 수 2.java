import java.util.Scanner;

// DP를 공부해 봅시다.
public class Main {
	static long[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new long[n + 1];

		for (int i = 0; i < n + 1; i++) {
			arr[i] = -1;
		}

		arr[0] = 0;
		arr[1] = 1;
		System.out.println(fib(n));
	}

	public static long fib(int n) {
		if (arr[n] == -1) {
			arr[n] = fib(n - 1) + fib(n - 2);
		}
		return arr[n];
	}
}