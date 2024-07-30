package step_1.no_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        String b;
        int d;
        int[] c = new int[3];

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.next();

        for(int i =0;i<3;i++) {
            c[i] = b.charAt(2-i)-'0';
            System.out.printf("%d\n", a*c[i]);
        }
        d = Integer.parseInt(b);
        System.out.printf("%d", a*d);
    }
}
