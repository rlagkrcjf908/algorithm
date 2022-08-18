package Ssafy.Algorithm.A_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
/**
 * 완탐, 시뮬레이션
 */

public class swea_2117_solution {
    private static int [] cost = {1,5,13,25,41,61,85,113,145,181,221,265,313,365,421,481,545,613,685,761,841,925,1013,1105,1201,1301,1405,1513,1625,1741,1861,1985,2113,2245,2381,2521,2665,2813,2965,3121};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1; test <= TC ; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 도시의 크기 N, 5<= N <= 20
            int M = Integer.parseInt(st.nextToken()); // 집에서 지불할 비용 M, 1<= M <= 10
            List<int[]> home = new ArrayList<int[]>(); // 행과 열을 저장
            for (int r = 0; r < N; r++) {
                String s = br.readLine();
                for (int c = 0, index = 0; c < N; c++, index += 2) {
                    if (s.charAt(index) == '1') { //집이면 1

                        home.add(new int[]{r, c});

                    }

                }

            }
            // k*k+(k-1)*(k-1)
            int maxcnthome = 0;
            for (int r = 0; r < N; r++) {
                for (int c = 0, index = 0; c < N; c++, index += 2) {
                    for (int k = 1; k < 40; k++) {
                        int cnthome = 0;
                        for (int h = 0; h < home.size(); h++){
                            //r,c home.get(h)= {r,c}
                            if(Math.abs(home.get(h)[0]-r) + Math.abs(home.get(h)[1]-c)<k){
                                cnthome++;
                            }
                        }
                        if(cnthome * M >= cost[k]&&maxcnthome < cnthome){

                        }
                    }
                }
            }
            sb.append("#").append(test).append(" ").append(maxcnthome).append("\n");
        }
        System.out.print(sb.toString());
    } //end of main
} // end of class
