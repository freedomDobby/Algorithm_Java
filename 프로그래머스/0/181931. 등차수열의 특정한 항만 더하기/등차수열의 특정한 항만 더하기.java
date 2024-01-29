import java.util. *;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int len = included.length;
        int[] arr = new int[len];
        arr[0] = a;
        
        for(int i= 1; i < len; i++){
            arr[i] += arr[i-1]+d;
        }
         for(int i = 0; i < len; i++)
             if(included[i]) answer += arr[i];
        
        
        return answer;
    }
}