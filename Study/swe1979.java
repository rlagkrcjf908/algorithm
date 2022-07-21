package Study;
// SWEA  1979 솔루션
import java.io.*;
import java.util.*;
public  class swe1979 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int search = 0;
            int [][] arr = new int[N][N];
            for(int j = 0 ; j < N ; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0 ; k < N ; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            for(int j = 0 ; j < N ; j++){
                int cnt = 0;
                for(int k = 0 ; k < N ; k++){
                    if(arr[j][k]==1) cnt++;
                    else if(cnt >= 1 && arr[j][k] == 0){
                        if(cnt == K) search++;
                        cnt = 0;
                    }
                }
                if(cnt == K) search++;

            }
            for(int k = 0 ; k < N ; k++){
                int cnt = 0;
                for(int j = 0 ; j < N ; j++){
                    if(arr[j][k]==1) cnt++;

                    else if(cnt >= 1 && arr[j][k] == 0){
                        if(cnt == K) search++;
                        cnt = 0;
                    }
                }
                if(cnt == K) search++;

            }


            System.out.print("#" + (i+1)+ " " + search);
            System.out.print("\n");
        }
    }
}


