import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] c1 = before.toCharArray();
        char[] c2 = after.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(Arrays.equals(c1, c2)) answer = 1;
        else answer = 0;
        
        return answer;
    }
}