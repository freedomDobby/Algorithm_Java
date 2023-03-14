import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			if (num != 0) {
				stack.add(num);
				//System.out.println(stack);
			} else {
				stack.pop();
			}
		}
		//System.out.println(stack);
		int sum = 0;
		while (!stack.empty()) {
			sum += stack.pop();
		}
				
		//sum += stack.pop();
		System.out.println(sum);
	}
}