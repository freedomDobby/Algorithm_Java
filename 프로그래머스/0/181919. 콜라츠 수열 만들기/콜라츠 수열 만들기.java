import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[500];
        answer[0] = n;

        // 자연수 x가 1이 될 때까지
        int idx = 0;
        while (n != 1) {
            if (n % 2 == 0) n = n / 2;
            else n = n * 3 + 1;
            
            // 배열에 값을 저장하고 인덱스 증가
            answer[++idx] = n;
        }

        // 배열의 크기를 현재까지 사용된 크기로 조절
        answer = Arrays.copyOf(answer, idx + 1);

        return answer;
    }
}
