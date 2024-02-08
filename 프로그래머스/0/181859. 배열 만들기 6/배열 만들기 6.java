import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.get(stk.size() - 1) == arr[i]) { 
                    stk.remove(stk.size() - 1);
                    i++;
                } else {
                    stk.add(arr[i]);
                    i++;
                }
            }
        }
        
        // 만약 빈 배열을 반환해야한다면 [-1]을 반환
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        
        // List를 int 배열로 변환하여 반환
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
