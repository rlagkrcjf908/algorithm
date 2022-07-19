package code;
// SWEA  2001 솔루션
import java.io.*;
import java.util.*;
public class swe2001 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];
            for(int j = 0 ; j < N ; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0 ; k < N ; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            int max = 0;
            for(int j = 0 ; j <= N-M ; j++){
                for(int k = 0 ; k <= N-M; k++){
                   int sum = 0;
                    for(int l = j ; l < j+M ; l++ ){
                        for(int o = k ; o < k+M ; o++ ){
                            sum += arr[l][o];
                        }
                    }
                    max = Math.max(max, sum);
                }

            }

            System.out.print("#" + (i+1)+ " " + max);
            System.out.print("\n");
        }
    }
}

