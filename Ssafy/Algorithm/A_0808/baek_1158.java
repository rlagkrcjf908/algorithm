package Ssafy.Algorithm.A_0808;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baek_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer>queue = new LinkedList<>();


        for(int i = 1 ; i<= N ; i++){
            queue.add(i);
        }

        while(!(queue.isEmpty())){
            for(int i = 1; i<=K ; i++){
                if(i == K){
                    sb.append(queue.poll()+", ");
                }else{
                    queue.add(queue.poll());
                }
            }
        }
        System.out.print("<"+sb.substring(0,sb.length()-2)+">");






    }
}
