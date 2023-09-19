import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] map;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;


	public static void main(String[] args) throws NumberFormatException, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		comb(0, 0);
		System.out.println(min);

	}

	private static void comb(int cnt, int start) {
		if (cnt == N / 2) {
			check();
			return;
		}

		for (int i = start; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				comb(cnt + 1, i + 1);
				visit[i] = false;
			}
		}
	}

	private static void check() {
		int start = 0;
		int link = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visit[i] == true && visit[j] == true) {
					start += (map[i][j] + map[j][i]);
				} else if (visit[i] == false && visit[j] == false) {
					link += (map[i][j] + map[j][i]);
				}
			}
		}
		int val = Math.abs(start-link);
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		min = Math.min(min, val);

	}
}