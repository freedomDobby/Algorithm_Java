class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board[0].length;
        boolean[][] map = new boolean[len][len];

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        // 지뢰 찾기
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(board[i][j] == 1) {
                    map[i][j] = true;
                }
            }
        }

        // 주변에 지뢰가 있는지 확인하고 처리
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(map[i][j] && board[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < len && ny >= 0 && ny < len) {
                            if(!map[nx][ny]) { // 지뢰가 없었던 위험지역일때만
                                board[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }

        // 안전지대 카운트
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
