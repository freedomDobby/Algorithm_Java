import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        //1. max는 nums.length / 2
        int max = nums.length / 2;
        //2. 중복 없는 Hashset 생성
        HashSet<Integer> set = new HashSet<>();
        // set에 nums의 값들을 하나씩 넣어서 그 size를 확인
        for(int i : nums){
            set.add(i);
        }
        // 만약 set의 크기가 max보다 크다면 정답은 max (문제에서 nums.length이 최대라고 지정해줌)
        if(set.size() > max){
            return max;
        }else{
            return set.size();
        }
    }
}