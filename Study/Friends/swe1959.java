package Study.Friends;
// SWEA  1959 솔루션
import java.io.*;
import java.util.*;
public class swe1959 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int test1 = Integer.parseInt(st.nextToken());
            int test2 = Integer.parseInt(st.nextToken());
            int[] arr1 = new int[test1];
            int[] arr2 = new int[test2];
            int max = 0;
            int tmp = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < test1; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < test2; j++) {
                arr2[j] = Integer.parseInt(st.nextToken());
            }

            if(test1 > test2){
                for(int j = 0 ; j <= test1 - test2 ; j++){
                    int a = j;
                    int sum = 0;
                    for(int k = 0; k < test2 ; k++){
                        tmp = arr1[a++] * arr2[k];
                        sum += tmp;
                    }
                    if(max<sum) max = sum;

                }
            }
            else if(test1 == test2){
                for(int j = 0 ; j < test1 ; j++){
                    max += arr1[j] * arr2[j];
                }
            }
            else{
                for(int j = 0 ; j <= test2 - test1 ; j++){
                    int a = j;
                    int sum = 0;
                    for(int k = 0; k<test1 ; k++){
                        tmp = arr1[k] * arr2[a++];
                        sum += tmp;
                    }
                    if(max<sum) max = sum;

                }

            }
            System.out.print("#" + (i+1) + " "+ max);
            System.out.print("\n");




        }
    }
}


