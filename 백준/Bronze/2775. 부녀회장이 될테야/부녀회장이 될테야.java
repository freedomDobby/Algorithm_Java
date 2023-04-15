import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		// 아파트 배열을 만들어 준다.
		int[][] apart = new int[15][15];
		// 0 층 i호에는 i명이 살고 있다.
		for (int i = 1; i < apart.length; i++) {
			apart[0][i] = i;
		}

//			// apart확인 출력문
//			for (int i = 0; i < apart.length; i++) {
//				for (int j = 0; j < apart.length; j++) {
//					System.out.print(apart[i][j] + " ");
//				}
//				System.out.println();
//			}
//			// 출력문 종료

		// k층 n호에 살고있는 사람의 수는
		// 배열을 채우자
		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= 14; j++) {
				apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
			}
		}

		// StringBuilder sb = new StringBuilder();

		// 정답 뽑아내기
		for (int t = 0; t < tc; t++) {
			int k = sc.nextInt();// 살고 있는 층
			int n = sc.nextInt();// 살고 있는 호
			System.out.println(apart[k][n]);
		}
	} // TestCaseLoop

}