import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int[9][9];
    static int comp;
    static int row;
    static int col;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        comp = Integer.MIN_VALUE;
        row = -1;
        col = -1;
        int num = 0;
        for (int i = 1; i <= 9 ; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1 ; j <= 9; j++){
                 num = Integer.parseInt(st.nextToken());
                if (num>comp){
                    comp = num;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(comp);
        System.out.println(row +" "+ col);

    }
}