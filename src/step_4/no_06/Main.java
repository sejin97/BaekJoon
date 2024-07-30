package step_4.no_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,m, i , j ,t;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int [] arr = new int[n];

        for(int a = 0; a<n; a++)
            arr[a] = a+1;

        for(int b = 0; b<m; b++) {
            i = sc.nextInt();
            j = sc.nextInt();
            t = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = t;
        }
        for(int c = 0; c<arr.length; c++)
            System.out.print(arr[c] + " ");
    }
}
