package step_5.no_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String strnum = sc.next();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(strnum.charAt(i)+"");
            sum += num;
        }
        System.out.println(sum);
    }
}
