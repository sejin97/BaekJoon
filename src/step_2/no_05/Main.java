package step_2.no_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h,m, md, td ;
        Scanner scan = new Scanner(System.in);

        h  = scan.nextInt();
        m = scan.nextInt();

        md = m-45;

        if(md<0)
            if(h == 0)
                System.out.printf("%d %d\n", 23, 60+md);
            else
                System.out.printf("%d %d\n", h-1, 60+md);
        else
            System.out.printf("%d %d\n", h,md);
    }
}
