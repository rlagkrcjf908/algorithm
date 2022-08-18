package Ssafy.Algorithm.A_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1987 {
    static int R, C;
    static int [][] map;
    static boolean []visited = new boolean[26];
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int [R][C];
        for (int i = 0; i < R ; i++){
            String s = br.readLine();
            for (int j = 0; j<C; j++){
                map[i][j] = s.charAt(j)-'A';
            }
        }


              dfs(0,0,0);
             System.out.println(ans);
    }

    private static void dfs(int x, int y, int cnt) {
        if(visited[map[x][y]]){
            ans = Math.max(ans,cnt);
            return;
        }
        else{
            visited[map[x][y]]= true;
            for (int i = 0 ; i < 4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx>=0&&nx<R&&ny>=0&&ny<C){
                    dfs(nx,ny,cnt+1);
                }
            }
            visited[map[x][y]] = false;

        }
    }
}
