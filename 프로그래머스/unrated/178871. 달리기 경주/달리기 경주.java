import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        //Map 생성
        Map<String, Integer> mapPlayer = new HashMap<>();
        Map<Integer, String> mapRank = new HashMap<>();
        
        //Map 초기화: 각각 key, value를 교차해서 저장
        for(int i = 0; i < players.length; i++){
            mapPlayer.put(players[i],i);
            mapRank.put(i, players[i]);
        }
        
        // 반복문 돌면서 
        for(int i = 0; i< callings.length; i++){
            // player와 rank 추출
            int nowRank = mapPlayer.get(callings[i]);
            String nowPlayer = mapRank.get(nowRank);
            //swap
            //추월한 player 뽑아내기 : 코드의 간결함을 위해
            String overTaking = mapRank.get(nowRank-1);
            //진짜 swap
            mapPlayer.put(nowPlayer, nowRank - 1);
			mapPlayer.put(overTaking, nowRank);

			mapRank.put(nowRank - 1, nowPlayer);
			mapRank.put(nowRank, overTaking);
		}

		for (int i = 0; i < players.length; i++) {
			answer[i] = mapRank.get(i);
		}

		return answer;
	}
        
}