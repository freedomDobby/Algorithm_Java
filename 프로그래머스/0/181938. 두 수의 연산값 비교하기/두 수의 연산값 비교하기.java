import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab2 = 2 * a * b;
        String ab1 =  String.valueOf(a) + String.valueOf(b);
        int ab = Integer.parseInt(ab1);
        
        if(ab2 > ab){
            answer = ab2;
        }else{
            answer = ab;
        }
        return answer;
    }
}