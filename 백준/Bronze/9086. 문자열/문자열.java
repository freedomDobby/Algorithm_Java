import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(bf.readLine());
//		System.out.println(tc);
		for (int i = 0; i < tc; i++) {

			String str = bf.readLine();
//			System.out.println(str);
			System.out.printf("%s%s\n", str.charAt(0), str.charAt(str.length()-1));
		}
	}

}