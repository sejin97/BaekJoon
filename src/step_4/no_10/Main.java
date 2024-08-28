package step_4.no_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        float avg = 0;
        float sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (m >= arr[i]) {
                m = m;
            } else {
                m = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
             sum = sum + ((float)arr[i]/m) * 100;
        }
        avg = sum / n;
        System.out.println(avg);
    }
}
