package Study.Baekjoon.Group_HW.HW4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek_2178 {
	static int N, M;
	static int [][] map;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static boolean[][] visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j)-'0';
			}
		}
		visited = new boolean [N][M];
		visited[0][0] = true;
		
		
		bfs(0,0);
		System.out.println(map[N-1][M-1]);
		
	}
	private static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			int nowx = now[0];
			int nowy = now[1];
			
			for(int i = 0; i<4 ; i++) {
				int nx = nowx + dx[i];
				int ny = nowy + dy[i];
				
				if(nx< 0 || ny<0 || nx >=N || ny >= M) continue;
				
				if(visited[nx][ny]|| map[nx][ny]==0) continue;
				
				queue.add(new int[] {nx,ny});
				map[nx][ny] = map[nowx][nowy]+1;
				visited[nx][ny] = true;
				
			}
		}
	}
}
