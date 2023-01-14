import java.util.Scanner;

public class Bronze_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();

		if ((m + c) > 60) {
			h = h + 1;
			m = (m + c) - 60;

			if (((m + c) - 60) >= 60) {
				h++;
				m = m - 60;
			}

			if (h >= 23) {
				h = 0;
			}

			System.out.println(h + " " + m);

		} else {
			m = m + c;
			System.out.println(h + " " + m);
		}
	} 
   
}
