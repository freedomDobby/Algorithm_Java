import java.util.Scanner;

public class Bronze_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int answer = 0;

		for (int i = 1; i <= num; i++) {
			answer += i;
		}
		System.out.println(answer);
	}

}
