import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[1002];
        int count = 1;
        int sum = 0;
        for(int i = 1; i<=1000 ; i++){
            for(int j = 0; j<i; j++){
                if(count == 1001) break;
                arr[count] = i;
                count++;

            }
        }
        for(int i = a; i <=b; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}