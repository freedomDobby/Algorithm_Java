import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int tc = sc.nextInt();
	static String[] words = new String[tc];

	public static void main(String[] args) {
		int ans = 0;
		for (int t = 0; t < tc; t++) {
			
			if (cnt()) {
				ans++;
			}
		} // TestCaseLoop

		
		

		System.out.println(ans);
	}

	public static boolean cnt() {
		boolean[] check = new boolean[26];
		String str = sc.next();
		Arrays.fill(check, false);
		int w1 = 0;
		for (int i = 0; i < str.length(); i++) {
			int w2 = str.charAt(i);
			// 앞글자랑 바로 뒷 글자가 다를 때
			if (w1 != w2) {
				if (!check[w2 - 'a']) {
					check[w2 - 'a'] = true;
					w1 = w2;
					
				} else {
					return false;
				} // 안에있는 if
			} // 밖 if
		}
		return true;
	}
}