package Study.Friends;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_14225 {
    static int N;
    static int[] arr;
    static boolean []visited = new boolean[20*100000];
    static int answer = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }
        get(0, 0);
        while(visited[answer]){
            answer++;
        }
        System.out.println(answer);
    }

    private static void get(int start, int sum) {
        if(start == N){
            visited[sum] = true;
        }
        else{
            get(start+1,sum+arr[start]);
            get(start+1,sum);
        }
    }

}
