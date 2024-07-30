package step_3.no_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int X,N,a,b,t;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        X  = scan.nextInt();
        N = scan.nextInt();

        for(int i =0 ; i<N; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            t = a*b;
            total += t;
        }
        if(X == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
