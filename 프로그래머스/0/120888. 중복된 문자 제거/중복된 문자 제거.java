import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        
        for(int i = 0; i < my_string.length(); i++){
            linkedHashSet.add(my_string.charAt(i));
        }
        
        for(char c : linkedHashSet) answer += c;
        
        return answer;
    }
}
