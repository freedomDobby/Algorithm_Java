class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int len = my_string.length();
        char[] myChars = my_string.toCharArray();
        
         for (int i = 0; i < indices.length; i++) {
             myChars[indices[i]] = '1';
         }
        
        for (char c : myChars) {
            if (c != '1') {
                answer += c;
            }
        }
        
        return answer;
    }
}
