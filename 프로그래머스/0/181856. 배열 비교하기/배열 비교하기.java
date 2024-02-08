import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        int num1 = 0;
        int num2 = 0;
        
        if(len1 == len2){
            for(int i = 0; i < len1; i++){
                num1 += arr1[i];
                num2 += arr2[i];
            }
            if( num1 > num2) answer = 1;
            else if( num1 < num2) answer = -1;
            else answer = 0;
        }else{
            if( len1 > len2) answer =1;
            else answer = -1;
        }
        
        
        return answer;
    }
}