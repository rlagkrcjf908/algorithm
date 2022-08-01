package Study.Friends;

import java.util.*;

public class swe1961 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int t = 1; t <= test; t++) {
                int n = sc.nextInt();
                int[][] a = new int[n][n];
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                System.out.println("#" + t + " ");
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        System.out.print(a[n-j-1][i]);
                    }
                    System.out.print(" ");
                    for(int j = 0; j < n; j++) {
                        System.out.print(a[n-i-1][n-j-1]);
                    }
                    System.out.print(" ");
                    for(int j = 0; j < n; j++) {
                        System.out.print(a[j][n-1-i]);
                    }
                    System.out.println();
                }
            }
        }
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < N; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }


            System.out.print("#" + (i+1) + " ");
            System.out.println();
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N ; k++){
                    System.out.print(arr[N-k-1][j]);
                }
                System.out.println(" ");
                for(int k = 0; k < N ; k++){
                    System.out.print(arr[N-j-1][N-k-1]);
                }
                System.out.println(" ");
                for(int k = 0; k < N ; k++){
                    System.out.print(arr[k][N-1-j]);
                }
                System.out.println();
            }
        }*/
        }

