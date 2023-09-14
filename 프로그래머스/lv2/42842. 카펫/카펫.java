class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int box = brown + yellow;
        
        for(int i = 1; i <= box; i++){
            if(box % i == 0){
                int row = i;
                int col = box / i;
                
                if((row - 2) * (col - 2) == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }
        }

        return answer;
    }
}
