package Study.Baekjoon.study_2023.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 개수세기
/*
문제
        총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

 */
public class baek_10807 {
    static int n;
    static int [] arr;
    static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int result = 0;
        n  = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st  = new StringTokenizer(br.readLine());
        k= Integer.parseInt(st.nextToken());

        for (int i = 0; i<n;i++){
            if (arr[i]==k){
                result += 1;
            }
        }

        System.out.println(result);
        br.close();
    }
}
/*
11
1 4 1 2 4 2 4 2 3 4 4
2

3

11
1 4 1 2 4 2 4 2 3 4 4
5

0
 */