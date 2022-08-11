package Ssafy.Algorithm.A_0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_9229 {
    static int [] arr;
    static int N,M,max;
    static void select(int cnt, int index, int sum){
        if(sum>M)return;

        if(cnt==2){
            if(max < sum) max = sum;
            return;
        }
        if(index == N)return;

        select(cnt+1,index+1, sum+arr[index]);
        select(cnt, index+1,sum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test = 1 ; test <= T ; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
             N = Integer.parseInt(st.nextToken());
             M = Integer.parseInt(st.nextToken());
            max = -1;
            arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i<N ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            select(0,0,0);


            System.out.println("#"+test+ " "+ max);


        }

    }
}
