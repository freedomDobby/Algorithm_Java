class Solution {
    public String solution(int age) {
        String answer = "";
        char[] code = {'a', 'b', 'c', 'd', 'e','f','g','h','i','j'};
        String codeAge = Integer.toString(age);
        int len = codeAge.length();
        
        for(int i = 0; i < len; i++){
            answer += code[Character.getNumericValue(codeAge.charAt(i))];
        }
        
        return answer;
    }
}