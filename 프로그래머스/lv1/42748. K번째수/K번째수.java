import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 정답이 될 배열 크기 설정
        int[] answer = new int[commands.length];
        // 반복문 돌면서 sort전 배열 구하기
        for(int i = 0; i<commands.length; i++){
            int[]array1 = Arrays.copyOfRange(array, commands[i][0] -1 , commands[i][1]);
            // 이제 sort
            Arrays.sort(array1);
            answer[i] = array1[commands[i][2]-1];
        }
        return answer;
    }
}