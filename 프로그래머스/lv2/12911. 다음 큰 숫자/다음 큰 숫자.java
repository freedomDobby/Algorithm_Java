class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //일단, 2진수로 바꿔야함
        String b = Integer.toBinaryString(n);
        //2진수에서 1의 갯수를 cnt해야함
        int cnt = 0;
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '1') cnt++;
        }
        // 1의 갯수가 같으면서  n보다 큰 수를 찾아야함
        // 이거 1단계 맞아?
        while(true){
            //이진수는 String, 내가 하고싶은건 int연산...
            n++;
            String next = Integer.toBinaryString(n);
            int cnt1 = 0;
            for(int i = 0; i < next.length();i++){
                if(next.charAt(i)=='1'){
                    cnt1++;
                }
            }
            if(cnt == cnt1){
                answer = n;
                break;
            }
        }
        return answer;
    }
//     private static int toBinary(int n){
        
//     }
}