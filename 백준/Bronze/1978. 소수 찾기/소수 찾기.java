// 백준 1978  소수찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int [] arr = new int[t];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < t ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(ISprime(arr[i])) count++;
        }
        System.out.println(count);
    }
    static boolean ISprime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n) ; i++){
            if(n % i == 0)return false;
            }
        return true;
        }



    }