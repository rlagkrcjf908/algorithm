package Study.Baekjoon.Group_HW.HW2;

import java.util.Scanner;

// 더하기 사이클
public class baek_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        int cnt = 0;
        int copy = test;


        while(true){
            test = ((test%10)*10) + (((test/10) +  (test%10))%10);
            cnt++;

            if(copy == test){
                break;
            }

        }
        System.out.println(cnt);
    }
}
