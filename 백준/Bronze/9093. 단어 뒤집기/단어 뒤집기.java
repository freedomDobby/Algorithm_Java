import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < tc; t++) {
			// stack만들기
			Stack<Character> stack = new Stack<>();
			StringBuilder sb = new StringBuilder();
			String str = sc.nextLine();
			for (int i = 0; i < str.length(); i++) {
				// stack이 비어있으면 그냥 담기
				if (stack.empty()) {
					stack.push(str.charAt(i));
					// System.out.println(stack);
				} else {
					// stack이 비어있지 않다면
					// 공백이 나왔을때, stack.pop()
					stack.push(str.charAt(i));
					// System.out.println(stack);
					if (str.charAt(i) == ' ') {
						sb.append(stack.pop());
						while (!stack.empty())
							sb.append(stack.pop());
					}
				}
			}
			//System.out.println(stack);
			sb.append(" ");
			while (!stack.empty()) {
				sb.append(stack.pop());
			}

			System.out.println(sb.substring(1, sb.length()));
			//stack.clear();
		}
	}
}