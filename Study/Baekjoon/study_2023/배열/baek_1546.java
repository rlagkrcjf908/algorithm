package Study.Baekjoon.study_2023.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1546 {
    /*
    문제
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
     */

    static int N;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        long sum =0;
        long max =0;

        for (int i = 0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(sum*100.0/max/N);

    }
    /*
    예제 입력 1
3
40 80 60
예제 출력 1
75.0
예제 입력 2
3
10 20 30
예제 출력 2
66.666667
10-2 이하의 오차를 허용한다는 말은 정확히 소수 2번째 자리까지 출력하라는 뜻이 아니다.

예제 입력 3
4
1 100 100 100
예제 출력 3
75.25
예제 입력 4
5
1 2 4 8 16
예제 출력 4
38.75
예제 입력 5
2
3 10
예제 출력 5
65.0
예제 입력 6
4
10 20 0 100
예제 출력 6
32.5
예제 입력 7
1
50
예제 출력 7
100.0
예제 입력 8
9
10 20 30 40 50 60 70 80 90
예제 출력 8
55.55555555555556
     */
}
