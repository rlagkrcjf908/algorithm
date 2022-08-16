package Ssafy.Algorithm.A_0816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_2839 {
    static int N, r, c;
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        size = (int) Math.pow(2,N);

        int ans = solve(0,0,size);
        System.out.println(ans);

    }

    public static int solve(int nx, int ny, int size) {
        if(size == 1){
            return 0;
        }

        if (r < nx + size /2 && c < ny+size/2){
            return solve(nx,ny,size / 2 );

        }
        else if (r < nx + size /2 && c < ny+size){
            return solve(nx,ny+size/2,size / 2 ) + (int) Math.pow(size /2,2);
        }
        else if (r < nx + size  && c < ny+size/2){
            return solve(nx+size/2,ny,size / 2 ) + (int) Math.pow(size / 2,2)*2;
        }
        else{
            return solve(nx+size/2,ny+size/2,size / 2 ) + (int) Math.pow(size / 2,2)*3;
        }
    }
}
