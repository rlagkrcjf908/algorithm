package Study.Baekjoon.Group_HW.HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek_1874 {
    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int start = 0;

        while(N-->0) {
            int val = Integer.parseInt(br.readLine());

            if(val>start) {
                for(int i = start+1 ; i <= val ; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");

                }
                start = val;
            }else if(stack.peek()!=val) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
