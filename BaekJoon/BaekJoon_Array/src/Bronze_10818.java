import java.util.Scanner;

public class Bronze_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("몇번 반복? >>>");
		int test = sc.nextInt();
		int arr[] = new int[test];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < test; i++) {
//			System.out.print("숫자입력 >>>");
			int num = sc.nextInt();
			arr[i] = num;
		}

		for (int x : arr) {
			min = Math.min(min, x);
			max = Math.max(max, x);
		}

		System.out.printf("%d %d", min, max);
	}

}
