package step_3.no_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(int j=1; j<=n;j++) {
            for(int i=0; i<j;i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
