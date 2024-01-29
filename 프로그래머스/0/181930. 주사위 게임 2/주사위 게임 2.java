import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int A = a + b + c;
        int B = (int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2);
        int C = (int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3); 
        
        // 세 숫자가 모두 다르다면 a + b + c
        if (a != b && b != c && c != a) {
            answer = A;
        }
        // 세 숫자가 모두 같다면 
        else if (a == b && a == c) {
            answer = A * B * C;
        }
        else {
            answer = A * B;
        }
        
        return answer;
    }
}
