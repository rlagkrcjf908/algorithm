import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int row;
    static int col;
    static char[][] board;
    static int count;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        board = new char[row][col];
        count = Integer.MAX_VALUE;

        for (int i = 0; i < row; i++){
            String str = br.readLine();
            for (int j = 0; j < col; j++){
                board[i][j] = str.charAt(j);
            }
        }
        N = row-7;
        M = col-7;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                find(i,j);
            }
        }
        System.out.println(count);
    }

    private static void find(int i, int j) {
        int x = i+8;
        int y = j+8;
        int temp = 0;

        char first = board[i][j];

        for (int a = i; a < x; a++){
            for (int b = j; b < y; b++){
                if (board[a][b] != first ){
                    temp++;
                }
                first = change(first);

            }
            first = change(first);

        }
        temp = Math.min(temp, 64-temp);

        count = Math.min(count,temp);

    }

    private static char change(char first) {
        if (first == 'W'){
             first = 'B';
        } else if (first == 'B') {
             first = 'W';
        }
        return  first;
    }
}