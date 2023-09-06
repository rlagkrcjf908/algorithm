// 백준 2309 일곱난쟁이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 9;
        int [] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        for(int i = 0; i < n ; i ++){
            for(int j = i+1 ; j < n ; j++){
                if(sum - arr[i] - arr[j]==100){
                    for(int k = 0; k<n ; k++){
                        if(i==k || j==k){
                            continue;
                        }
                        System.out.println(arr[k]);
                    }
                    System.exit(0);
                }
            }
        }


    }
}