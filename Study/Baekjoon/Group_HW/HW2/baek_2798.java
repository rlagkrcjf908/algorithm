package Study.Baekjoon.Group_HW.HW2;
//블랙잭
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.exit;

public class baek_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] card = new int[N];
        int sumCheck = 0;
        int closeNum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i<N ; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0 ; i<N-2 ; i++){
            for(int j = i+1 ; j<N-1 ; j++){
                for(int k = j+1 ; k < N; k++){
                    sumCheck = card[i] + card[j] + card[k];
                    if(sumCheck == M){
                        System.out.println(sumCheck);
                        exit(0);
                    }
                    if(sumCheck < M && closeNum < sumCheck){
                        closeNum = sumCheck;
                    }
                }
            }
        }
        System.out.println(closeNum);
    }
}
