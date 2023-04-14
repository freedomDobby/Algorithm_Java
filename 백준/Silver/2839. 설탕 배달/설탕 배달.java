import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kg = sc.nextInt();

		int cnt = 0;

		while (true) {
			if (kg % 5 == 0) {
				cnt += kg / 5;
				kg = kg - (kg / 5);
				System.out.println(cnt);
				//System.out.printf("#/5 %d\n",kg);
				break;
			} else {
				kg -= 3;
				cnt++;
				//System.out.printf("#/3 %d\n",kg);
			}

			if (kg < 0) {
				System.out.println(-1);
				break;
			}
		}

	}

}