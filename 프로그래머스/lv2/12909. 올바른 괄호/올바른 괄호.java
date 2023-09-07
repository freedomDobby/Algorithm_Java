import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>(); // Stack 선언 (Character 타입으로)
        boolean answer = true;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); // 문자열에서 한 글자씩 가져옴

            if(c == '(') {
                stack.push(c); // '(' 일 경우 stack에 추가
            } else if(c == ')') {
                if(stack.isEmpty()) {
                    answer = false; // ')' 가 들어왔는데 stack이 비어있으면 균형이 안 맞음
                    break;
                } else {
                    stack.pop(); // '(' 가 있으면 pop
                }
            }
        }

        if(!stack.isEmpty()) {
            answer = false; // 모든 문자열을 순회한 뒤에도 stack이 비어있지 않으면 균형이 안 맞음
        }

        return answer;
    }
}
