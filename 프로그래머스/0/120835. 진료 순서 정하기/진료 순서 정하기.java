class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int min = 100;
        
        for(int i : emergency){
            if(i < min) min = i;
        }
        
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j] ) answer[i]++;
            }
            answer[i]++;
        }
        
        return answer;
    }
}