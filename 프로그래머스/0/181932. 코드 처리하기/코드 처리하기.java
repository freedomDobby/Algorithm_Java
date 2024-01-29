import java.util.*;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode=0;
        int len = code.length();
        
        
    for(int i = 0; i < len;i++){
        // mode가 0일 때
        if(mode == 0 ){
                // code[idx]가 "1"이 아니면
                if(code.charAt(i) != '1'){
                    // idx가 짝수일 때만 
                    if(i % 2 == 0){
                        //  ret의 맨 뒤에 code[idx]를 추가
                        answer += code.charAt(i);
                    }
                }
                //code[idx]가 "1"이면
                else{
                  // mode를 0에서 1로 바꿉니다.
                    mode = 1;
                    // break;
                }
            }
        
        // mode가 1일 때
        else{
            // code[idx]가 "1"이 아니면
                 if(code.charAt(i) != '1'){
                // idx가 홀수일 때만
                    if(i % 2 == 1){
                        //  ret의 맨 뒤에 code[idx]를 추가
                        answer += code.charAt(i);
                    }
                }
            // code[idx]가 "1"이면
                else{
                //mode를 1에서 0으로
                mode = 0;    
                }
                
            }
    
        }
        
        // return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 retur
        if(answer.equals("")) answer = "EMPTY";
        
        
        return answer;
    }
}