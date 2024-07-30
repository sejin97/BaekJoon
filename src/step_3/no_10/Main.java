package step_3.no_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        for(int i =0; i<n;i++) {
            for(int j = 0;j<n-(i+1);j++)
                System.out.print(" ");
            for(int s = 0; s<i+1; s++)
                System.out.print("*");
            System.out.println();
        }
    }
}
