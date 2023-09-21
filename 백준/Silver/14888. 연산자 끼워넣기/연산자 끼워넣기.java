import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int [] number;
	static int [] oper = new int[4];
	static int Max = Integer.MIN_VALUE, Min = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		number = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<N;i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<4;i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}
		
		
			dfs(number[0],1);
			System.out.println(Max);
			System.out.println(Min);
		
	}
	private static void dfs(int start, int cnt) {
		if(cnt==N) {
			Max = Math.max(Max, start);
			Min = Math.min(Min, start);
			return;
		}
		for(int i = 0; i<4;i++) {
			if(oper[i]>0) {
				oper[i]--;
				switch(i){
					case 0:dfs(start+number[cnt],cnt+1); 
					break;
						
					case 1:dfs(start-number[cnt],cnt+1);
					break;

					case 2:dfs(start*number[cnt],cnt+1);
					break;

					case 3:dfs(start/number[cnt],cnt+1);
					break;

				}
				oper[i]++;
			}
		}
	}
}