package Study.Friends;
import java.util.Scanner;
public class baek_15661 {

        static int N, min;
        static int[][] map;
        static boolean[] visit;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            // 입력값 받고
            min = Integer.MAX_VALUE;
            visit = new boolean[N];
            solve(0, 0);
            System.out.println(min);
        }

        private static void solve(int depth, int index) {
            if (depth == N) {
                check();
                return;
            }
            visit[depth] = true;
            solve(depth + 1, index);
            visit[depth] = false;
            solve(depth + 1, index);
        }

        private static void check() {
            int start = 0;
            int link = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (visit[i] != visit[j])
                        continue;
                    if (visit[i])
                        start += map[i][j] + map[j][i];
                    else
                        link += map[i][j] + map[j][i];
                }
            }
            int tmp = Math.abs(start - link);
            if (tmp < min)
                min = tmp;
        }
    }


