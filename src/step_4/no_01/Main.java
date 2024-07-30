package step_4.no_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,v, cnt=0;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        int[] arr = new int [n];

        for(int i = 0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        v = scan.nextInt();

        for(int i = 0; i<arr.length; i++) {
            if( arr[i] == v)
                cnt++;
        }
        System.out.println(cnt);
    }
}
