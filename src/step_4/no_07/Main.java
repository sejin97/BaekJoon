package step_4.no_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int[] stdnum = new int[30];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<stdnum.length; i++) {
            stdnum[i] = i+1;
        }

        for(int j = 0; j<stdnum.length -2;j++) {
            a = sc.nextInt();
            for(int i = 0; i<stdnum.length; i++) {
                if(a == stdnum[i])
                    stdnum[i] = 0;
            }
        }
        for(int i = 0; i<stdnum.length;i++)
            if(stdnum[i]!= 0)
                System.out.println(stdnum[i]);
    }
}
