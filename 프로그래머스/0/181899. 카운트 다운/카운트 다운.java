import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
       List<Integer> answer = new ArrayList<Integer>();
        int i = 0; 
        
        while(start_num - i != end_num-1){
            answer.add(start_num - i);
            i++;
        }
        
        return answer.stream().mapToInt(num -> num).toArray();
    }
}