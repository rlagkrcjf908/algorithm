package Ssafy.Algorithm.A_0811;

import java.io.*;
import java.util.*;

class Solution {

    static int[][] ham;
    static int cal;
    static int N, max;
    static boolean[] isSelected;

    // 맛은 최대한 유지, 정해진 칼로리를 넘지 않는 햄버거 주문
    // 재료 자르지 않고 그대로
    // 재료에 대한 점수, 칼로리
    // 선호도 - 맛에 대한 점수의 합
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); // 재료 수
            cal = Integer.parseInt(st.nextToken()); // 제한 칼로리
            max = Integer.MIN_VALUE;
            ham = new int[N][];
            // 맛에 대한 점수, 칼로리
            // 재료 수만큼 반복
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                ham[i] = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
            }
            isSelected = new boolean[N];
            generateSubset(0, cal);
            sb.append("#").append(test_case).append(" ").append(max).append("\n");
        }
        System.out.println(sb);
    }

    private static void generateSubset(int cnt, int cal) {
        // cnt : 부분집합을 처리하기 위해 고려된 원소 수

        if (cnt == N) {
            // 부분집합 완성
            int sum = 0;
            int cal_sum = 0;
            int score_sum = 0;
            for (int i = 0; i < N; i++) {
                if (isSelected[i]) {
                    cal_sum += ham[i][1]; // 칼로리 합
                    score_sum += ham[i][0]; // 점수 합
                }
            }
            if (cal_sum <= cal) {
                if (score_sum > max)
                    max = score_sum;
            }
            return;
        }

        // 현재 원소를 부분집합에 넣기
        isSelected[cnt] = true;
        generateSubset(cnt + 1, cal);
        // 현재 원소를 부분집합에 넣지 않기
        isSelected[cnt] = false;
        generateSubset(cnt + 1, cal);
    }
}
