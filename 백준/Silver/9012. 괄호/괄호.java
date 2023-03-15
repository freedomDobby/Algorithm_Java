import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt(); // 테스트케이스
		for (int t = 0; t < tc; t++) {
			Stack<Character> stack = new Stack<>();
			String str = sc.next();

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == '(') {
					stack.push(ch);
					
				} else {
					if (stack.empty()) {
						stack.push(ch);
						break;
					} else {
						stack.pop();
					}
				}
			}

			//System.out.println(stack);
			if (stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}