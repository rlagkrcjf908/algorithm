package Study.Baekjoon.study_2023.배열;

import java.io.*;
import java.util.StringTokenizer;

public class baek_10818 {
    /*
    문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
     */

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++){
            int value = Integer.parseInt(st.nextToken());
            if (Min > value){
                Min = value;
            }
            if (Max < value){
                Max = value;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Min +" "+ Max);
        bw.flush();
        bw.close();
    }
}
/*
5
20 10 35 30 7

7 35
 */
