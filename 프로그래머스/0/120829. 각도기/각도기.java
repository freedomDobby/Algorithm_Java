class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(90 < angle && 180 > angle) answer = 3;
        else if (angle == 90) answer = 2;
        else if (0 < angle && 90 > angle) answer = 1;
        else answer = 4;
        return answer;
    }
}