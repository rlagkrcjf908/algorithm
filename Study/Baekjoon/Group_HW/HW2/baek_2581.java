package Study.Baekjoon.Group_HW.HW2;
import java.io.*;

public class baek_2581 {
    // 백준 2581  소수

        public static void main(String[] args)throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            int min = N;

            for(int i = M ; i <=N ; i++){
                if(ISprime(i)) {
                    sum += i;
                    if(min > i) min = i;
                }
            }

            if(sum == 0) System.out.print("-1");
            else{
                System.out.println(sum);
                System.out.println(min);
            }
        }
        static boolean ISprime(int n){
            if(n==1) return false;
            for(int i = 2; i <= Math.sqrt(n) ; i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }


