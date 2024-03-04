import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        int len = str.length();
        
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == '7') answer++;
        }
        
        
        return answer;
    }
}