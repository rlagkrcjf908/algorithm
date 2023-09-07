import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        for(int i = a; i > 0 ; i--){
            for(int j  = i;j > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}