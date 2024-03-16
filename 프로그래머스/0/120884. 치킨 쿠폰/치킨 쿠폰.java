class Solution {
    public int solution(int chicken) {
        int service = 0;
        int cupon = chicken;
        
        while(cupon > 9){
            int temp = cupon / 10;
            service += temp;
            cupon = cupon % 10;
            cupon += temp;
        }
        
        return service;
    }
}