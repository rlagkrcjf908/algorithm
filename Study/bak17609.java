package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//백준 17609
public class bak17609 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        while(s.length()<t.length()){
            StringBuffer change = new StringBuffer();
            if(t.endsWith("A")){
                t = t.substring(0, t.length()-1);
            }
            else if(t.endsWith("B")){
                t = t.substring(0, t.length()-1);
                t = change.append(t).reverse().toString();
            }
        }

        if(s.equals(t)){
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
