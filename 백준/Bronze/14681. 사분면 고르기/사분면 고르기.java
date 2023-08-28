import java.util.Scanner;

// 사분면 고르기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[2];

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        if(arr[0] > 0 && arr[1] > 0){
            System.out.println(1);
        }else if(arr[0] < 0 && arr[1] > 0){
            System.out.println(2);
        }else if(arr[0] < 0 && arr[1] < 0){
            System.out.println(3);
        }else if(arr[0] > 0 && arr[1] < 0){
            System.out.println(4);
        }

    }
}
