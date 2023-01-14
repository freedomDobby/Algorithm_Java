import java.util.Scanner;

public class Bronze_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int num3 = num2 % 100;
		int num4 = num3 % 10;
		
		System.out.println(num1 * num4);
		System.out.println(num1 * (num3 / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
	}

}
  