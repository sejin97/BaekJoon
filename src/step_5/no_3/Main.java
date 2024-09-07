package step_5.no_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        sc.nextLine();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].charAt(0));
            System.out.println(arr[i].charAt(arr[i].length()-1));
        }


    }
}
