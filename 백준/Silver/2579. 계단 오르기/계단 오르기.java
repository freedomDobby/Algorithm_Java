import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 계단의 갯수

		int[] step = new int[301];
		int[] score = new int[301];

		for (int i = 1; i <= n; i++) {
			step[i] = sc.nextInt();
		} // 계단 점수 넣기

		//System.out.println(Arrays.toString(step));

		score[1] = step[1];
		score[2] = step[1] + step[2];
		score[3] = Math.max(step[1], step[2]) + step[3];
		//System.out.println(Arrays.toString(score));

		for (int i = 4; i <= n; i++) {
			score[i] = Math.max(score[i - 3] + step[i - 1], score[i - 2]) + step[i];
		}

		System.out.println(score[n]);
	}
}