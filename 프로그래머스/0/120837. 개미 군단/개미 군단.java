class Solution {
    public int solution(int hp) {
        int answer = 0;
        int Jant = 5; 
        int Bant = 3; 
        int Iant = 1; 
        
         
            answer += hp / Jant;
            hp = hp % Jant; 
        
      
            answer += hp / Bant; 
            hp = hp % Bant; 
        
       
            answer += hp / Iant; 
            hp = hp % Iant; 
        
        
        return answer;
    }
}
