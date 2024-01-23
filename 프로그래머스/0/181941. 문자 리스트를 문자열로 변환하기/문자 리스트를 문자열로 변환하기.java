class Solution {
    public String solution(String[] arr) {
        String answer = "";
        int len = arr.length;
        // System.out.print(len);
        
        for(int i = 0; i < len; i++){
            answer += arr[i];
        }
        return answer;
    }
}