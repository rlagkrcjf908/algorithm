package Study.Baekjoon.Group_HW.HW4;

import java.util.Scanner;

public class baek_3049 {
	static int N;
	static boolean[] visited;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		System.out.println((N*(N-1)*(N-2)*(N-3)/24));
	}
}




/*import java.util.Scanner;

public class baek_3049 {
	static int N;
	static boolean[] visited;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		ans = 0;
		visited = new boolean[N];
		Comb(0, 0);
		System.out.println(ans/24);
	}

	private static void Comb(int index,int cnt) {
		if(N < 4) {
			ans = 0;
			return;
		}else if(index==4){
			ans++; 
		}
		for(int i = index; i<N ; i++) {
			visited[i] = true;
			Comb(index+1,cnt+1);
			visited[i] = false;
		}
	}
}
*/