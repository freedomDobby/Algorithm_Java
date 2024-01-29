class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 홀수만 이어 붙인 str
        String A = "";
        // 홀수만 이어 붙인 str
        String B = "";
        
        for(int i = 0 ; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                B += Integer.toString(num_list[i]);
            }else{
                A += Integer.toString(num_list[i]);
            }
        }
        
        answer = Integer.parseInt(A) + Integer.parseInt(B);
        
        return answer;
    }
}