import java.util.Scanner;

public class Bronze_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			int k = num * i;
			System.out.println(num + " * " + i + " = " + k);
		}
	}
}
