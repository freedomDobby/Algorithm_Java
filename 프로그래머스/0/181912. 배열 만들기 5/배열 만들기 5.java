import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(String str : intStrs){
            int num =  Integer.parseInt(str.substring(s, s + l));
            if(num > k) answer.add(num);
        }

// for(int i = 0; i< intStrs.length; i++){
//     if(Integer.parseInt(intStrs[i].substring(s,s+1))>k) answer.add(Integer.parseInt(intStrs[i].substring(s,s+1)));
// }
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}