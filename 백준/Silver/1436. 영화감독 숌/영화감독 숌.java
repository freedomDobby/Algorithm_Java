import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N을 입력 받는다.
		int N = sc.nextInt();

		// n을 1부터 10000까지 증가시키며 '666'이 포함되어 있다면 cnt++를 해준다.
		// cnt == N 일때 n이 정답

		int n = 0;
		int cnt = 0;
		while (cnt != N) {
			n++;
			if (String.valueOf(n).contains("666")) {
				cnt++;
				if (cnt == N) {
					System.out.println(n);
				}
			}
		}
	}
}