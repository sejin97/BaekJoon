package step_3.no_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T;
        T = scan.nextInt();
        int[] sum = new int[T];
        int[] A = new int[T];
        int[] B = new int[T];

        for(int i=0; i<T ; i++)
        {
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
            sum[i] = A[i]+B[i];
        }
        for(int i =0; i<T;i++)
            System.out.printf("Case #%d: %d + %d = %d\n",i+1, A[i],B[i], sum[i]);
    }
}
