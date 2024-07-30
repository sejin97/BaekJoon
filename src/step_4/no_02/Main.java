package step_4.no_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<a.length; i++)
            if(a[i] < x)
                System.out.print(a[i]+" ");
    }
}
