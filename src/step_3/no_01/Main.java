package step_3.no_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for(int i = 1; i<10;i++)
            System.out.printf("%d * %d = %d\n", n ,i,n*i);
    }
}
