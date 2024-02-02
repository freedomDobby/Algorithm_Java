class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int len = my_string.length();
        
        for(int i = 0; i < len; i++){
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z')
            answer[my_string.charAt(i)- 'A']++;
           else if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z')
            answer[26 + my_string.charAt(i)- 'a']++;
        }
        
        return answer;
    }
}