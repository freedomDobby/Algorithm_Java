class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        char[] charArray = my_string.toCharArray();
        
        for(int i = c - 1; i < charArray.length; i += m){
            answer += charArray[i];
        }

        return answer;
    }
}