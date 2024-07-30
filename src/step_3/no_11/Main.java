package step_3.no_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A,B;
        int size=0;
        int current = 3;
        int [] sum= new int[3];
        boolean T = true;
        Scanner scan = new Scanner(System.in);

        while(T) {
            A = scan.nextInt();
            B = scan.nextInt();

            if( size  == current) {
                int [] temp = new int[current+5];
                for (int i=0; i<size; i++)
                    temp[i] = sum[i];
                sum = temp;
                current += 3;
            }

            if( A == 0 && B == 0)
                T = false;
            sum[size] = A+B;
            size++;

        }
        for(int i=0;i<size-1;i++) {
            System.out.println(sum[i]);
        }
    }
}
