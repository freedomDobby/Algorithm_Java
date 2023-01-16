import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bronze_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		LinkedHashSet<> linkedHashSet =
				new LinkedHashSet<>(Arrays.asList(arr));
		
		System.out.println(count);
	}

}
