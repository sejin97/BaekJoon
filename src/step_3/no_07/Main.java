package step_3.no_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A,B,T;
        T = scan.nextInt();
        int[] sum = new int[T];

        for(int i=0; i<T ; i++)
        {
            A = scan.nextInt();
            B = scan.nextInt();
            sum[i] = A+B;
        }
        for(int i =0; i<T;i++)
            System.out.printf("Case #%d: %d\n",i+1, sum[i]);
    }
}
