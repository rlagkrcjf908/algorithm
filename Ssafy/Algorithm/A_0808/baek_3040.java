package Ssafy.Algorithm.A_0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        int [] result = new int[7];
        int sum = 0;
        int fake1 = 0, fake2 = 0;

        for(int i = 0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for(int i = 0; i < 9 ; i++){
            for(int j = 1 ; j<9 ; j++){
                if(arr[i]+arr[j]==sum-100){
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }
        for(int i = 0; i< 9; i++){
            if(fake1 == i || fake2 == i){
                continue;
            }
            System.out.println(arr[i]);
        }

    }
}
