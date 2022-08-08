package Study.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baek_1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
            for(int test = 1 ; test <= 10 ; test ++){
            int N = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 8 ; i++){
                queue.add(Integer.parseInt(st.nextToken()));
            }

            int v = 1;
            while(v!=0){
                for(int i=1; i<6;i++){
                    v = queue.poll();
                    v -= i;
                    if(v<=0){
                        v=0;
                    }
                    queue.offer(v);
                    if(v==0)break;

                }
            }
            System.out.print("#" + test + " ");
            for(int i = 0; i<8 ; i++){
                int result = queue.poll();
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}
