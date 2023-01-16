import java.util.Arrays;
import java.util.Scanner;

public class Bronze_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length ; i++) {
			for (int k = 1; k < 10; k++) {
				System.out.printf("i(%d) : %d  k(%d) : %d\n",i,arr[i],k,arr[k]);
				if (arr[i] == arr[k]) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
