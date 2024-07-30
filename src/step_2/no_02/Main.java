package step_2.no_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        num = scan.nextInt();

        if(90<=num)
            System.out.println("A");
        else if(80 <= num)
            System.out.println("B");
        else if(70 <= num)
            System.out.println("C");
        else if(60 <= num)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
