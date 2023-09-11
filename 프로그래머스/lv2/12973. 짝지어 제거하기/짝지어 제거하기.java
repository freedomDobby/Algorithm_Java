import java.util.*;
//이런 문제는 stack을 이용하던가?
class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        //스택이 비어있지 않고 맨 위에있는게 같음 넣나,,,?
        // foreach문 코테에서 기억 안나서 못썼는데 이제 앎!
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
            return stack.isEmpty()? 1: 0;
        }
    }
