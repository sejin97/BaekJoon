package step_2.no_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int y;
        Scanner scan = new Scanner(System.in);

        y = scan.nextInt();

        if(y%4 == 0 && y %100 !=0)
            System.out.println(1);
        else if(y%400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
        scan.close();
    }
}
