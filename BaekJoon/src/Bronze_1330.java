import java.util.Scanner;

public class Bronze_1330 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(">");
		} else if (num1 < num2) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	} 
} 
   