import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
        N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
*/
public class Main {
    static int N, K;
    static int [][] A;
    static int [][] B;
    static int [][] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N][K];
        B = new int[N][K];

        for (int i = 0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i<N;i++){
            for (int j = 0; j < K; j++){
                System.out.print(A[i][j]+B[i][j]+" ");
            }
            System.out.println();
        }

    }
}