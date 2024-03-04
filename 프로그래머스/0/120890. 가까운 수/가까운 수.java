class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0]; 
        int temp = 0;
        int min = Math.abs(array[0] - n); 
        
        for(int i = 1; i < array.length; i++) {
            temp = Math.abs(n - array[i]);
            
            if(temp < min) {
                min = temp;
                answer = array[i];
            }
            else if(temp == min && array[i] < answer) answer = array[i];
        }
        
        return answer;
    }
}