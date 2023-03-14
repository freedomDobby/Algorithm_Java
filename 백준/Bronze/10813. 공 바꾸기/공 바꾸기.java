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

		for (int i = 0; i < m; i++) {
			int idx = sc.nextInt();
			int num = sc.nextInt();
			int tmp = arr[idx];
			arr[idx] = arr[num];
			arr[num] = tmp;
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}