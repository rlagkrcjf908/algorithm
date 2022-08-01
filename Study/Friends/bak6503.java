package Study.Friends;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak6503 {
    public static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            String arr = br.readLine();

            int[] check = new int[128];
            int right = -1, left = -1, cnt = 0, res = 0;

            while (left <= right) { // 투포인터 알고리즘
                if (cnt < n || (cnt == n && check[arr.charAt(right + 1)] > 0)) {
                    right++;
                    check[arr.charAt(right)]++;
                    if (check[arr.charAt(right)] == 1)
                        cnt++;

                } else {
                    left++;
                    check[arr.charAt(left)]--;
                    if (check[arr.charAt(left)] == 0)
                        cnt--;
                }
                res = Math.max(right - left, res);
                if (right == arr.length() - 1)

                    break;
            }
            System.out.println(res);
        }
        br.close();
    }
}
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
////백준 6503
//public class bak6503 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        while(true){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            if(n==0) break;
//            String s = br.readLine(); // 공백포함
//            int cnt =0;
//            int max = 0;
//            int[] search = new int[128];
//            int start =0;
//            int end = 0;
//            while(start < end){
//                if(cnt < n ){
//                    end++;
//
//
//                }
//            }
//
//
//        }
//    }
//}
