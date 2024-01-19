import java.util.*;

class Solution {
    static boolean[] visited;

    public int solution(String numbers) {
        visited = new boolean[numbers.length()];

        Set<Integer> ans = new HashSet<>();
        dfs(numbers, "", 0, ans);

        int count = 0;
        for (int num : ans) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    // DFS
    public void dfs(String numbers, String s, int depth, Set<Integer> ans) {
        // numbers의 끝까지 다 탐색했다면 종료
        if (depth >= numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                ans.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, s + numbers.charAt(i), depth + 1, ans);
                visited[i] = false;
            }
        }
    }

    // 소수 찾기
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}