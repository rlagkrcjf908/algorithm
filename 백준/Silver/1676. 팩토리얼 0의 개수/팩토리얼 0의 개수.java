// 백준 1676 팩토리얼
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int count = 0;

        while(test >= 5){
            count += test / 5;
            test /= 5;
        }
        System.out.println(count);
    }
}

