class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int len = db.length;
        // 아이디 먼저 확인
        for(int i = 0; i < len; i++){
            // 아이디가 같을 경우    
            if(id_pw[0].equals(db[i][0])){
                //비밀번호까지 같으면
                if(id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;   
                }
                else {
                    answer = "wrong pw";
                    break;
                }
            }
            else answer = "fail";
        } 
        return answer;
    }
}