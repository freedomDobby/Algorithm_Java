class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        int len = my_string.length();
        
        for(int i = 0; i < len; i++){
            if(!my_string.valueOf(my_string.charAt(i)).equals(letter)) answer+= my_string.charAt(i);
        }
        
        return answer;
    }
}