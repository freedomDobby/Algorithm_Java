class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] strArr = my_string.toCharArray();
        
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i] >= 'a' && strArr[i] <= 'z') 
                answer += Character.toUpperCase(strArr[i]);
            else 
                answer += Character.toLowerCase(strArr[i]);
        }
        
        return answer;
    }
}
