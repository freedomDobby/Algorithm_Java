import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 테이블 생성
		int[] dp = new int[n + 2];
		// 초기화
		dp[1] = 1;
		dp[2] = 2;
		// 점화식 구현
		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		System.out.println(dp[n] % 10007);
	}
}