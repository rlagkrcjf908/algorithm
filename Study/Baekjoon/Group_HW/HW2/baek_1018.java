package Study.Baekjoon.Group_HW.HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판칠하기
public class baek_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[M][N];
        int cnt = 0;

        for(int i = 0; i<M ; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(int j = 0 ; j<N ; j++){
                board[i][j] = s.charAt(j);
            }

        }

        for(int i = 0; i<M ; i++){
            for(int j = 0 ; j<N ; j++){
                if(board[0][0] == 'w'){
/*
                    board[][];
*/
                }
            }

        }
        System.out.println(cnt);
    }
}
