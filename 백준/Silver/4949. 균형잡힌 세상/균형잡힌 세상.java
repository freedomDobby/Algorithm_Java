import java.util.Scanner;
import java.util.Stack;

public class Main {
	static String s;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			s = sc.nextLine();
			if (s.equals(".")) {
				break;
			}
			System.out.println(solve(s));
		}
	}

	private static String solve(String str) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			}

			else if (c == ']') {
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty())
			return "yes";

		else
			return "no";
	}
}