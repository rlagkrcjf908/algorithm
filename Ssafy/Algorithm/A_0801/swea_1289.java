package Ssafy.Algorithm.A_0801;
// 원재의 메모리 복구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1 ; tc <= T ; tc++){
            String s = br.readLine();
            int [] arr = new int [s.length()];
            for (int i = 0; i < s.length() ; i++){
                arr[i] = s.charAt(i) - '0';
            }
            int cnt = arr[0];

            for (int i = 1 ; i< arr.length ; i++){
                if(arr[i] != arr[i-1]){
                    cnt++;
                }
            }
            System.out.println("#"+ tc + " " + cnt);

        }
    }

}
