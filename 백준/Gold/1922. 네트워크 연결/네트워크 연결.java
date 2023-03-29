import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int V, E;
	static int[] p;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		StringTokenizer st = new StringTokenizer(br.readLine());
		V = sc.nextInt();
		E = sc.nextInt();

		int[][] edges = new int[E][3];

		for (int i = 0; i < E; i++) {
//			st = new StringTokenizer(br.readLine());
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		}

		Arrays.sort(edges, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		p = new int[V + 1];

		// make_set
		for (int i = 0; i < V + 1; i++) {
			p[i] = i;
		}

		long ans = 0;
		long pick = 0;

		for (int i = 0; i < E; i++) {
			int px = findset(edges[i][0]);
			int py = findset(edges[i][1]);

			if (px != py) {
				union(px, py);
				ans += edges[i][2];
				pick++;
			}
			if (pick == (V - 1))
				break;
		}
		System.out.println(ans);

	}

	private static void union(int px, int py) {
		p[findset(py)] = p[px];
	}

	private static int findset(int x) {
		if (x != p[x]) {
			p[x] = findset(p[x]);
			return p[x];
		} else {
			return x;
		}
	}
}