// 백준 2460  기차놀이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int sum = 0;
       int max = 0;
       for(int i = 0 ; i < 10 ; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int in = Integer.parseInt(st.nextToken());
           int out = Integer.parseInt(st.nextToken());
           sum = sum - in + out;

           if(max<sum){
               max = sum;
           }

       }
       System.out.println(max);


    }
}
