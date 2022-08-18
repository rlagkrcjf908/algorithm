package Ssafy.Algorithm.A_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class swea_2117 {
    static int N, M, K;
    static int homemax;
    static List<int[]> houses ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test = 1 ; test <= T ; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N= Integer.parseInt(st.nextToken());
            M= Integer.parseInt(st.nextToken());

            houses = new ArrayList<>();
            for(int i = 0; i< N; i++){
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++){
                    if(st.nextElement().equals("1"))houses.add(new int[]{i,j});
                }
            }
            homemax = 0;

            if(N%2 == 0) K = N;
            else K = N-1;
            for(int k = K; k>=1 ; k--){
                if(homemax >(k*k+(k-1)*(k-1))) break;
                for(int i = 0; i< N; i++){
                    for (int j = 0; j < N; j++){
                        gethouse(i,j,K);
                    }
                }
            }
            System.out.println("#" + test + " "+ homemax);
        }
    }
    private static void gethouse(int x, int y, int k){
        int cnt = 0;
        for(int[] house : houses){
            int distance = Math.abs(x-house[0])+Math.abs(y-house[1]);
            if(distance < k-1) cnt++;
        }
        if(cnt*M - (k*k+(k-1)*(k-1)) >= 0){
            if(homemax < cnt) homemax = cnt;
        }
    }
}
