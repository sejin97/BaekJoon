package step_4.no_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer [] arr = new Integer[9];
        Integer [] arr1 = new Integer[9];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        System.out.println(arr1[8]);
        System.out.println(Arrays.asList(arr).indexOf(arr1[8])+1);
    }
}
