import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, max = 0;
    static int[] T, P;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        T = new int[N + 1];
        P = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        DFS(1, 0);

        System.out.println(max);
    }

    private static void DFS(int idx, int sum) {
        if (idx == N + 1) {
            max = Math.max(max, sum);
            return;
        }

        if (idx + T[idx] <= N + 1) {
            DFS(idx + T[idx], sum + P[idx]);
        }

        DFS(idx + 1, sum);
    }
}