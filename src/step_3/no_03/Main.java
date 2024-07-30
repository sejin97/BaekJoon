package step_3.no_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        for(int i =1; i <=n; i++)
            total = total + i;
        System.out.println(total);
    }
}
