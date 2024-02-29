class Solution {
    public int solution(int hp) {
        int answer = 0;
        int Jant = 5; 
        int Bant = 3; 
        int Iant = 1; 
        
        while(hp >= Jant){ 
            answer += hp / Jant;
            hp = hp % Jant; 
        }
        while(hp >= Bant){ 
            answer += hp / Bant; 
            hp = hp % Bant; 
        }
        while(hp >= Iant){ 
            answer += hp / Iant; 
            hp = hp % Iant; 
        }
        
        return answer;
    }
}
