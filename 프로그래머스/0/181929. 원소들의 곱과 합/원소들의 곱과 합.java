import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        double A = 1;
        double B = 0; 
        
        for(int i : num_list){
        // 모든 원소들의 곱
            A *= i ;
        // 모든 원소들의 합
            B += i; 
        }
        
        // 모든 원소들의 합의 제곱 
        B = Math.pow(B, 2);
        
        // 조건문
        if(A < B) answer = 1; 
        else answer = 0;
        
        return answer;
    }
}