package step_1.no_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A,B,C;
        Scanner scan = new Scanner(System.in);
        A=scan.nextInt();
        B=scan.nextInt();
        C=scan.nextInt();
        System.out.printf("%d\n",(A+B)%C);
        System.out.printf("%d\n",((A%C) + (B%C))%C);
        System.out.printf("%d\n", (A*B)%C);
        System.out.printf("%d\n",((A%C) * (B%C))%C);
    }
}
