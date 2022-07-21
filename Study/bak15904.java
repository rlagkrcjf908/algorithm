package Study;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 15904
public class bak15904 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char [] ucpc ={'U', 'C', 'P', 'C'};
        int index = 0;
        for(int i = 0; i< s.length();i++) {
            if (s.charAt(i) == ucpc[index]) {
                index++;
            }
            if (index == 4) break;
            }
        if(index == 4){
                System.out.println("I love UCPC");
            }


        else {
            System.out.println("I hate UCPC");
        }
    }
}
// Union of Computer Programming Contest club contest