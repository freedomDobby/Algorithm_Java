import java.util.Scanner;

public class Bronze_2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[8];

		for (int i = 0; i < 8; i++) {
			int num = sc.nextInt();
			arr[i] = num;
//			System.out.println(arr[0]);
		}

		if (arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5 && arr[5] == 6 && arr[6] == 7
				&& arr[7] == 8) {
			System.out.println("ascending");
		} else if (arr[7] == 1 && arr[6] == 2 && arr[5] == 3 && arr[4] == 4 && arr[3] == 5 && arr[2] == 6 && arr[1] == 7
				&& arr[0] == 8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		

	}

}
