// 백준 2609 최대공약수 최소공배수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = getGCD(a,b);
        int lcm = getLCM(gcd,a,b);

        System.out.println(gcd);
        System.out.println(lcm);
        }



    static int getGCD(int a, int b) {
        if(b==0){
            return a;
        }
        return getGCD(b,a%b);

    }
    static int getLCM(int gcd, int a, int b){
        return a*b/gcd;

    }
}