package Ssafy.Algorithm.A_0801;

import java.io.*;
import java.util.*;

// 스위치 켜고 끄기
public class baek_1244 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();		StringTokenizer st;
            int switchs = Integer.parseInt(br.readLine());
            int[] arr = new int[switchs + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= switchs; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            } 		int Student = Integer.parseInt(br.readLine());
            for (int i = 0; i < Student; i++) {
                st = new StringTokenizer(br.readLine());
                int gender = Integer.parseInt(st.nextToken());
                int number = Integer.parseInt(st.nextToken());
                if (gender == 1) {
                    for (int j = 1; j <= switchs; j++) {
                        int arrNum = j * number;
                        if (arrNum > switchs)
                            break;
                        arr[arrNum] = Math.abs(arr[arrNum] - 1);
                    }			} else {
                    arr[number] = Math.abs(arr[number] - 1);
                    int Cycle=1;
                    while (true) {
                        if (number - Cycle >= 1 && number + Cycle <= switchs && arr[number - Cycle] == arr[number + Cycle]){
                            arr[number - Cycle] = Math.abs(arr[number - Cycle] - 1);
                            arr[number + Cycle] = Math.abs(arr[number + Cycle] - 1);
                            Cycle++;					}else break;
                    }
                }
            }		for (int i = 1; i <=switchs; i++) {
                sb.append(arr[i]);
                if(i%20==0) sb.append("\n");
                else sb.append(" ");
            }
            System.out.println(sb);
        }
    }


