package step_1.no_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A,B;
        Scanner scan = new Scanner(System.in);

        A = scan.nextInt();
        B = scan.nextInt();
        System.out.printf("%d\n", A+B);
        System.out.printf("%d\n", A-B);
        System.out.printf("%d\n", A*B);
        System.out.printf("%d\n", A/B);
        System.out.printf("%d\n", A%B);
    }
}
