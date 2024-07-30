package step_3.no_05;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int N,a;
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        for (int i = 0; i<N; i= i+4) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
