package Study.Baekjoon.Group_HW.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1388 {
	static int N,M;
	static char [][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N= Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		int result = 0;
		map = new char[N][M];
		for (int i = 0; i < N; i++) {

				map[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(i != 0 && map[i][j]=='|' &&map[i-1][j]=='|') {
					continue;
				}else if(j != 0 && map[i][j]=='-' &&map[i][j-1]=='-') {
					continue;
				}
				result++;
			}
		}
		System.out.println(result);
	}

	
}
