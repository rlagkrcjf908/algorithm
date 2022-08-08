package Study.Baekjoon.Group_HW.HW2;
// 정수N개의 합
public class baek_15596 {
    public class Test {
        long sum(int[] a) {
            long ans = 0;
            for(int i = 0 ; i<a.length ; i++){
                ans += a[i];
            }
            return ans;
        }
    }

}
