// 백준 2693 최대공약수 최소공배수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());

        while(cnt > 0){
            st = new StringTokenizer(br.readLine());
            int [] arr = new int[10];
            for(int i = 0 ; i < 10 ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
            cnt--;
        }



    }
}