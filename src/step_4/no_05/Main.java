package step_4.no_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,m,i,j,k;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int [] arr = new int[n];

        for( int a = 0; a<m; a++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for(int b = i; b<=j;b++) {
                arr[b-1] = k;
            }
        }
        for(int c = 0 ; c<n;c++)
            System.out.print(arr[c]+" ");
    }
}
