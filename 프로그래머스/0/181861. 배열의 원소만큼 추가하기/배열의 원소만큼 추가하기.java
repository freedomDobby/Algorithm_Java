import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i : arr){
            for(int x = 0; x < i; x++){
                answer.add(i);
            }
        }
        
        return answer;
    }
}