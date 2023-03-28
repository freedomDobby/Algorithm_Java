import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int V, E, start;
	static int[][] adjArr;
	static boolean[] visited_D;
	static boolean[] visited_B;
	static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt(); // 정접의 개수를 입력을 받는다.
		E = sc.nextInt(); // 간선의 수가 입력 된다.
		// 어디서 시작되는지 받아야겠죠?
		start = sc.nextInt(); // 시작되는 정접

		adjArr = new int[V + 1][V + 1];
		visited_D = new boolean[V + 1];
		visited_B = new boolean[V + 1];

		// 간선을 입력 받자.
		for (int i = 0; i < E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			adjArr[st][ed] = adjArr[ed][st] = 1;
		} // 간선 입력 끝

//		// 출력해보기
//		for (int i = 0; i < E; i++) {
//			for (int j = 0; j < E; j++) {
//				System.out.print(adjArr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		// 출력 끝

		DFS(start);
		System.out.println();
		BFS(start);
	}

	private static void BFS(int v) {
		queue.add(v);
		visited_B[v] = true;
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			System.out.print(curr + " ");
			for (int i = 0; i < adjArr.length; i++) {
				if (!visited_B[i] && adjArr[curr][i] == 1) {
					queue.add(i);
					visited_B[i] = true;
				}
			}
		}
	}

	private static void DFS(int v) {
		visited_D[v] = true;
		System.out.print(v + " ");
		for (int i = 0; i < adjArr.length; i++) {
			if (!visited_D[i] && adjArr[v][i] == 1) {
				DFS(i);
			}
		}
	}
}