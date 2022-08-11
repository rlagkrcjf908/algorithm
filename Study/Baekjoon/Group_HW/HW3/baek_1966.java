package Study.Baekjoon.Group_HW.HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class baek_1966 {
    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int test = 1 ; test<=T ; test++) {
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i<N ; i++) {
                queue.offer(new int[] {i,Integer.parseInt(st.nextToken())});
            }
            while(!queue.isEmpty()) {
                int[] start = queue.poll();
                boolean max = true;
                for(int i = 0; i < queue.size(); i++) {
                    if(start[1]<queue.get(i)[1]) {
                        queue.offer(start);
                        for(int j = 0; j<i; j++) {
                            queue.offer(queue.poll());
                        }
                        max=false;
                        break;
                    }

                }
                if(max == false) {
                    continue;
                }
                count++;
                if(start[0]==M) break;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);


    }

}