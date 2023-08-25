import java.util.Scanner;

public class Main {
	static int [][] dp = new int [30][30];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int test =1 ; test <= T ; test++) {
			int N= sc.nextInt();
			int M= sc.nextInt();
			sb.append(comb(M,N)+ "\n");
		}
		System.out.println(sb);
	}
	static int comb(int n, int m) {
		if(dp[n][m]>0) {
			return dp[n][m];
		}
		if(n == m || m == 0) {
			return dp[n][m]=1;
		}
		else return dp[n][m]=comb(n-1, m-1)+comb(n-1,m);
	}
}