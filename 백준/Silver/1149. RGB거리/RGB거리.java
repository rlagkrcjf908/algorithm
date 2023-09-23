import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int red = 0;
    static int green = 1;
    static int blue = 2;

    static int [][] cost;
    static int [][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        cost= new int[N][3];
        dp =new int[N][3];

        for (int i =0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            cost[i][red] = Integer.parseInt(st.nextToken());
            cost[i][green] = Integer.parseInt(st.nextToken());
            cost[i][blue] = Integer.parseInt(st.nextToken());
        }

        dp[0][red] = cost[0][red];
        dp[0][green] = cost[0][green];
        dp[0][blue] = cost[0][blue];
        System.out.println(Math.min(Paint(N- 1, red), Math.min(Paint(N - 1, green), Paint(N - 1, blue))));
    }

    static int Paint(int N, int color) {
        if(dp[N][color] == 0){
            if(color == red){
                dp[N][red]= Math.min(Paint(N-1,green),Paint(N-1,blue))+cost[N][red];

            }else if(color == green){
                dp[N][green]= Math.min(Paint(N-1,red),Paint(N-1,blue))+cost[N][green];

            }else{
                dp[N][blue]= Math.min(Paint(N-1,red),Paint(N-1,green))+cost[N][blue];

            }
        }
        return dp[N][color];
    }
}