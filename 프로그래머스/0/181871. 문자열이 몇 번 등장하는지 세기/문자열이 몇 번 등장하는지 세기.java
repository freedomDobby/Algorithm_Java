class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int msLength = myString.length();
        int pLength = pat.length();
        StringBuilder sb = new StringBuilder(myString);
        for(int i = 0; i <= msLength-pLength; i++) {
            if((sb.substring(i, i+pLength).equals(pat))) {
                answer++;
            }
        }
        return answer;
    }
}