import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int Max;
    static int count;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        Max = Integer.parseInt(st.nextToken());
        arr = new int[N];
        count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N-2; i++){
            for (int j = i+1; j<N-1;j++){
                for (int k = j+1; k<N;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if (sum >= count && sum <= Max){
                        count = sum;
                    }
                }
            }

        }

        System.out.println(count);

    }
}