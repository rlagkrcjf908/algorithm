import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] arr;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			if (N == 0)
				break;
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			visit = new boolean[N];
			comb(0, 0);
			System.out.println();
		}
	}

	private static void comb(int cnt, int start) {
		if (cnt == 6) {
			for (int i = 0; i < arr.length; i++) {
				if (visit[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		for (int i = start; i < arr.length; i++) {
			if(visit[i])continue;
			visit[i] = true;
			comb(cnt + 1, i);
			visit[i] = false;
		}

	}
}