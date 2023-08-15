import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] paper = new int[100][100];
    static int N;
    static int row;
    static int col;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        count = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            for (int a = row; a < row + 10 ; a++){
                for (int b = col; b < col + 10; b++){
                    if (paper[a][b] != 1){
                        paper[a][b] = 1;
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}