class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len = my_string.length();
        String[] suffix = new String[len];
        
        for(int i = 0; i < len; i++){
            suffix[i] = my_string.substring(i);
        }
        
        for(String str : suffix){
            if(str.equals(is_suffix)) answer = 1;
        }
        
        
        return answer;
    }
}