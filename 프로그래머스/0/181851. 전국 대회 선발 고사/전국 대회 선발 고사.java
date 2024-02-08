import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]) temp.add(rank[i]);
        }
        
        Collections.sort(temp);
        
        for(int i = 0; i < rank.length; i++){
            if(temp.get(0) == rank[i]) answer += 10000 * i;
            if(temp.get(1) == rank[i]) answer += 100 * i;
            if(temp.get(2) == rank[i]) answer += i;
        }
        
        return answer;
    }
}