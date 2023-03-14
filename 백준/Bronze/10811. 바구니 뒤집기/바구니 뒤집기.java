import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int m = sc.nextInt();

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		} // 초기 바구니에 들어있는 공 값

		for (int i = 1; i <= m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			for (int y = start; y <= (end - start) / 2 + start; y++) {
				// swap시키기
				int temp = arr[y];
				arr[y] = arr[end - y + start];
				arr[end - y + start] = temp;
			}
		}

		for (

				int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}