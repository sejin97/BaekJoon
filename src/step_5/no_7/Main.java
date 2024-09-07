package step_5.no_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] r = new int[t];
        String[] s = new String[t];
        for (int i = 0; i < t; i++) {
            r[i] = sc.nextInt();
            s[i] = sc.next();
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < r[i]; j++) {
            }
            System.out.println("r = " + r[i]);
            System.out.println("s = " + s[i]);
        }

        sc.close();
    }
}
