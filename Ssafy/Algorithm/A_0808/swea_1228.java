package Ssafy.Algorithm.A_0808;

import java.util.LinkedList;
import java.util.Scanner;

public class swea_1228 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int test = 1 ; test <= 10 ; test ++) {
            int N = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();

            for(int i = 0; i<N ; i++){
                list.add(sc.nextInt());
            }
            int order = sc.nextInt();
            for(int j = 0 ; j < order ; j++){
                String s = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();

                for(int k = 0; k<y ; k++){
                    list.add(x,sc.nextInt());
                    x++;
                }
            }
            int cnt = 0;
            System.out.print("#" + test+ " ");
            while(!(list.isEmpty())){
                if(cnt>9) break;
                System.out.print(list.poll() + " ");
                cnt++;
            }
            System.out.println();
        }
    }

}
