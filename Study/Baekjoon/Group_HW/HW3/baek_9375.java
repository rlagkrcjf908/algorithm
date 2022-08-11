package Study.Baekjoon.Group_HW.HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek_9375 {
    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken(); // 옷이름은 삭제

                String cloth = st.nextToken();

                if(map.containsKey(cloth)) { // 맵에서 보낸 옷종류값이 있는지 판단.
                    map.put(cloth,map.get(cloth)+1 ); // 종류의 개수 증가
                }else {
                    map.put(cloth,1);
                }

            }
            int result = 1;

            for(int val : map.values()) {
                result *= val+1;
            }

            sb.append(result -1 + " \n");
        }
        System.out.println(sb);
    }
}