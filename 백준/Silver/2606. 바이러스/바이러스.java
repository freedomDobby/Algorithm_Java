import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int v, e, cnt;
	static ArrayList<Integer> adj[];
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		v = Integer.parseInt(br.readLine());
		e = Integer.parseInt(br.readLine());

		adj = new ArrayList[v + 1];
		visited = new boolean[v + 1];

		for (int i = 0; i <= v; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < e; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int st = Integer.parseInt(s.nextToken());
			int ed = Integer.parseInt(s.nextToken());

			adj[st].add(ed);
			adj[ed].add(st);
		}

		DFS(1);
		System.out.println(cnt);

	}

	private static void DFS(int idx) {
		//System.out.println(Arrays.toString(adj));
		visited[idx] = true;

		for (int var : adj[idx]) {
			if (!visited[var]) {
				//System.out.println(var);
				cnt++;
				DFS(var);
			}
		}
	}	}