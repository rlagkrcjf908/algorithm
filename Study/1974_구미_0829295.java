package code;
import java.util.*;
public class swe1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t <= test; t++) {
            int[][] a = new int[9][9];
            int flag = 1;
            for(int i = 0; i < 9; i++) {
                int sum = 0;
                for(int j = 0; j < 9; j++) {
                    a[i][j] = sc.nextInt();
                    sum += a[i][j];
                }
                if(sum != 45)
                    flag = 0;
            }

            for(int i = 0; i < 9; i++) {
                int sum = 0;
                for(int j = 0; j < 9; j++) {
                    sum += a[j][i];
                }
                if(sum != 45)
                    flag = 0;
            }

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    int sum = 0;
                    for(int k = 0; k < 3; k++) {
                        for(int s = 0; s < 3; s++) {
                            sum += a[3*i + k][3*j + s];
                        }
                    }
                    if(sum != 45)
                        flag = 0;
                }
            }
            System.out.println("#" + t + " " + flag);
        }
    }

}
