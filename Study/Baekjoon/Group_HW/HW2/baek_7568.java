package Study.Baekjoon.Group_HW.HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int [] tall = new int[N];
        int [] weight = new int[N];
        for(int i = 0; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            tall[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i< N ; i++){
            int cnt = 1;
            for(int j = 0 ; j< N ; j++) {
                if (tall[i] < tall[j] && weight[i] < weight[j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
