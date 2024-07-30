package step_3.no_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int T,A,B;

        Scanner scan = new Scanner(System.in);
        T = scan.nextInt();
        int [] sum = new int[T];
        for(int i=0; i<T; i++) {
            A = scan.nextInt();
            B = scan.nextInt();
            sum[i] = A+B;
        }
        for(int j =0; j<T; j++)
            System.out.println(sum[j]);
    }
}
