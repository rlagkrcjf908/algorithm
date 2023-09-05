import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int a = 0;
        int b = 0;

        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] < B[i]) {
                b += 3;
            } else if (A[i] > B[i]) {
                a += 3;
            } else {
                a += 1;
                b += 1;
            }
        }
        System.out.printf("%d %d%n", a, b);
        if (a > b) {
            System.out.print('A');
        } else if (a < b) {
            System.out.print('B');
        } else {
            for (int i = 9; i >= 0; i--) {
                if (A[i] > B[i]) {
                    System.out.print('A');
                    break;
                } else if (A[i] < B[i]) {
                    System.out.print('B');
                    break;
                } else {
                    if (i == 0)
                        if (A[i] == B[i]) {

                            System.out.print('D');

                        }

                }
            }

        }

    }
}
