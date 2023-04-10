import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		dp[n] = 0;
		for (int i = n - 1; i > 0; i--) {
			dp[i] = dp[i + 1] + 1;
			if (i <= n / 2)
				dp[i] = Math.min(dp[i * 2] + 1, dp[i]);
			if (i <= n / 3)
				dp[i] = Math.min(dp[i * 3] + 1, dp[i]);
		}
		System.out.println(dp[1]);
	}
}