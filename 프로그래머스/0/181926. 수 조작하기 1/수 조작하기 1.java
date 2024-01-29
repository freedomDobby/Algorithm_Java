class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int len = control.length();
        
        for (int i = 0; i < len; i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 's') {
                n -= 1;
            } else if (control.charAt(i) == 'd') {
                n = n + 10;
            } else if (control.charAt(i) == 'a') {
                n = n - 10;
            }
        }
        answer = n;
        
        return answer;
    }
}
