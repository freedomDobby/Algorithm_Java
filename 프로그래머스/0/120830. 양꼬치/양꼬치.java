class Solution {
    public int solution(int n, int k) {
        int service = 0; 
        int answer = 0;
        // 할인 전 금액
        int price = (n * 12000) + (k * 2000);
        
        if(n >= 10) {
            service = (n / 10) * 2000;
        }
            answer = price - service;    
        
        return answer;
    }
}