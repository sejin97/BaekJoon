package step_4.no_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int[] str = new int[m];
        int[] end = new int[m];

        for (int i = 0; i < m; i++) {
            str[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (str[i] == end[i]) {
                continue;
            } else {
                for (int j = 0; j < end[i] - str[i]; j++) {
                    if (end[i] - j == str[i] + j || end[i] - j < str[i] + j) {
                        break;
                    } else {
                        temp = arr[end[i] - 1 - j];
                        arr[end[i] - 1 - j] = arr[str[i] - 1 + j];
                        arr[str[i] - 1 + j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                System.out.printf("%d ", arr[i]);
            } else {
                System.out.printf("%d ", arr[i]);
            }
        }

    }
}
