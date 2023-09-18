import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] board;
	static int day = 0;
	static Queue<Tomato> tomato;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static class Tomato {
		int x;
		int y;

		Tomato(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		board = new int[N][M];
		tomato = new LinkedList<Tomato>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if (board[i][j] == 1) {
					tomato.add(new Tomato(i, j));
				}
			}

		}
		System.out.println(bfs());

	}

	private static int bfs() {
		while (!tomato.isEmpty()) {
			Tomato t = tomato.remove();
			int x = t.x;
			int y = t.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >=0 && nx <N && ny >=0 && ny < M) {
					if (board[nx][ny] == 0) {
						tomato.add(new Tomato(nx, ny));
						board[nx][ny] = board[x][y] + 1;
					}
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (board[i][j] == 0)
					return -1;

				day = Math.max(day, board[i][j]);
			}

		}
		if (day == 1) {
			return 0;
		} else {
			return day - 1;
		}
	}

}