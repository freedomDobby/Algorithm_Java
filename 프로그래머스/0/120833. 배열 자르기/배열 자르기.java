class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 잘린 배열의 길이 계산
        int length = num2 - num1 + 1;
        // 잘린 배열을 저장할 배열 생성
        int[] answer = new int[length];
        
        // numbers 배열에서 num1부터 num2까지의 요소들을 answer 배열에 복사
        for (int i = 0; i < length; i++) {
            answer[i] = numbers[num1 + i];
        }
        
        // 잘린 배열 반환
        return answer;
    }
}
