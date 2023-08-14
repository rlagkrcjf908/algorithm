package Study.Baekjoon.study_2023.배열;

import java.io.*;
import java.util.StringTokenizer;

public class baek_10871 {
    /*
    문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     */
    static int N;
    static int limit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(st.nextToken());
        limit = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            int value = Integer.parseInt(st.nextToken());
            if (limit>value){
                bw.write(value+" ");
            }

        }
        bw.flush();
        bw.close();
    }
}
/*
10 5
1 10 4 9 2 3 8 5 7 6

1 4 2 3
 */
