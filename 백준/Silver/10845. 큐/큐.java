import java.io.*;
import java.util.*;

public class Main {
	static Queue<Integer> q;
	static StringBuilder sb;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		q = new LinkedList<>();
		StringTokenizer st;
		sb = new StringBuilder();
		String s;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			s = st.nextToken();
			if (s.equals("push"))
				push(Integer.parseInt(st.nextToken()));
			if (s.equals("pop"))
				pop();
			if (s.equals("size"))
				size();
			if (s.equals("empty"))
				empty();
			if (s.equals("front"))
				front();
			if (s.equals("back"))
				back();
		}

		System.out.print(sb);
	}

	static void push(int x) {
		q.add(x);
	}

	static void pop() {
		if (q.isEmpty()) {
			sb.append("-1\n");
		} else {
			sb.append(q.remove() + "\n");
		}
	}

	private static void size() {
		sb.append(q.size() + "\n");
	}

	private static void empty() {
		if (q.isEmpty()) {
			sb.append("1\n");
		} else {
			sb.append("0\n");
		}
	}

	private static void back() {
		if (q.isEmpty()) {
			sb.append("-1\n");
			return;
		} else {
			int lastValue = -1;
			for (int i = 0; i < q.size(); i++) {
				lastValue = q.remove();
				q.add(lastValue);
			}
			sb.append(lastValue + "\n");
		}
	}

	private static void front() {
		if (q.isEmpty()) {
			sb.append("-1\n");
		} else {
			sb.append(q.peek() + "\n");
		}
	}

}