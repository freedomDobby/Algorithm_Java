import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();

		int n = sc.nextInt();
		int start = 0;
		while (n-- > 0) {
			int val = sc.nextInt();
			if (val > start) {
				for (int i = start + 1; i <= val; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = val;
			} else if (stack.peek() != val) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}

}