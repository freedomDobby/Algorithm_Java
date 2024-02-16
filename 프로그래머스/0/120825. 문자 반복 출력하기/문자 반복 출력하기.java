class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        
        for(int j = 0; j < len; j++){
            for(int i = 0; i < n; i++){
                answer += my_string.charAt(j);
            }
        }
        
        return answer;
    }
}