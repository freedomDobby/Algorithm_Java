import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores={0,0,0};
        
        int len = answers.length;
        for(int i=0; i<len; i++) {
            if(answers[i] == a[i%5]) scores[0]++;
            if(answers[i] == b[i%8]) scores[1]++;
            if(answers[i] == c[i%10]) scores[2]++;
        }
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(max == scores[i]){
                ans.add(i+1);
            }
        }
        int length = ans.size();
        int[] answer = new int[length];     
        
        for(int i=0;i<length;i++){
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}