import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int q = 25;
		int d = 10;
		int n = 5;
		int p = 1;

		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;

		for (int t = 0; t < tc; t++) {
			int money = sc.nextInt();
//			System.out.printf("money: %d\n", money);
			if (money / q >= 0) {
				quarter = money / q;
				money = money % q;
//				System.out.println("q :" + money);
//				System.out.println(quarter);

			}
			if (money / d >= 0) {
				dime = money / d;
				money = money % d;
//				System.out.println("d :" + money);
//				System.out.println(dime);

			}
			if (money / n >= 0) {
				nickel = money / n;
				money = money % n;
//				System.out.println("n :" + money);
//				System.out.println(nickel);

			}
			if (money / p >= 0) {
				penny = money / p;
				money = money % p;
//				System.out.println("p :" + money);
//				System.out.println(penny);

			}

			System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);

		}
	}
}