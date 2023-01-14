import java.util.Scanner;

public class Bronze_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int arr[] = new int[n];

		for (int i = 0; i <= n - 1; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		int v = sc.nextInt();

		for (int k = 0; k <= n - 1; k++) {
			if (arr[k] == v) {
				count++;
			}
		}

		System.out.println(count);
	}

}
